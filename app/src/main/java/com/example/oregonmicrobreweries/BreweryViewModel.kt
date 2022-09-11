package com.example.oregonmicrobreweries

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.oregonmicrobreweries.data.local.Brewery
import com.example.oregonmicrobreweries.data.local.dummyBreweries

class BreweryViewModel(private val stateHandle: SavedStateHandle): ViewModel() {

    val state = mutableStateOf(dummyBreweries.restoreSelections())

    fun toggleFavorite(id: Int) {
        val breweries = state.value.toMutableList()
        val itemIndex = breweries.indexOfFirst { it.id == id }
        val item = breweries[itemIndex]
        breweries[itemIndex] = item.copy(isFavorite = !item.isFavorite)
        storeSelection(breweries[itemIndex])
        state.value = breweries
    }

    private fun storeSelection(item: Brewery) {
        val savedToggled = stateHandle.get<List<Int>?>(FAVORITES)
            .orEmpty().toMutableList()
        if (item.isFavorite) savedToggled.add(item.id)
        else savedToggled.remove(item.id)
        stateHandle[FAVORITES] = savedToggled
    }

    private fun List<Brewery>.restoreSelections(): List<Brewery> {
        stateHandle.get<List<Int>?>(FAVORITES)?.let { selectedIds ->
            val breweriesMap = this.associateBy { it.id }
            selectedIds.forEach { id ->
                breweriesMap[id]?.isFavorite = true
            }
            return breweriesMap.values.toList()
        }
        return this
    }

    companion object {
        const val FAVORITES = "favorites"
    }
}