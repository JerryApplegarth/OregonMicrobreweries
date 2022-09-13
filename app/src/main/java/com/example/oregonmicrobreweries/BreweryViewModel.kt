package com.example.oregonmicrobreweries

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.oregonmicrobreweries.data.local.Brewery
import com.example.oregonmicrobreweries.domain.BreweriesApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BreweryViewModel(private val stateHandle: SavedStateHandle): ViewModel() {

    private var restInterface: BreweriesApiService
    private lateinit var breweriesCall: Call<List<Brewery>>
    val state = mutableStateOf(emptyList<Brewery>())


    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://oregon-microbreweries-default-rtdb.firebaseio.com/")
            .build()
        restInterface = retrofit.create(
            BreweriesApiService::class.java
        )
        getBreweries()
    }
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




    private fun getBreweries() {
        breweriesCall = restInterface.getBreweries()
        breweriesCall.enqueue(
            object : Callback<List<Brewery>> {
                override fun onResponse(
                    call: Call<List<Brewery>>,
                    response: Response<List<Brewery>>
                ) {
                    response.body()?.let { breweries ->
                        state.value = breweries.restoreSelections()
                    }
                }

                override fun onFailure(call: Call<List<Brewery>>, t: Throwable) {
                    t.printStackTrace()
                }
            })
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