package com.example.oregonmicrobreweries.presentation.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.oregonmicrobreweries.BreweryViewModel
import com.example.oregonmicrobreweries.presentation.components.BreweryItem


@Composable
fun BreweryScreen() {
    val viewModel: BreweryViewModel = viewModel()

    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp,
            horizontal = 8.dp
        )
    ) {
        items(viewModel.state.value) { restaurant ->
            BreweryItem(restaurant) { id ->
                viewModel.toggleFavorite(id)
            }
        }
    }
}
