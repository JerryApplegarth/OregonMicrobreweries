package com.example.oregonmicrobreweries.presentation.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.oregonmicrobreweries.BreweryViewModel
import com.example.oregonmicrobreweries.presentation.components.BreweryItem
import com.example.oregonmicrobreweries.ui.theme.OregonMicrobreweriesTheme
import com.example.oregonmicrobreweries.ui.theme.newBackgroundColor


@Composable
fun BreweryScreen() {
    val viewModel: BreweryViewModel = viewModel()


    LazyColumn(
        contentPadding = PaddingValues(
            vertical = 8.dp,
            horizontal = 8.dp
        )
    ) {
        items(viewModel.state.value) { brewery ->
            BreweryItem(brewery) { id ->
                viewModel.toggleFavorite(id)
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "BreweryScreen"
)
@Composable
fun BreweryScreenPreview() {
    OregonMicrobreweriesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.newBackgroundColor
        ) {
            BreweryScreen()
        }
    }
}

