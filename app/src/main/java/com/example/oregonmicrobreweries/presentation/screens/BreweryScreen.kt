package com.example.oregonmicrobreweries.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.example.oregonmicrobreweries.data.local.dummyBreweries
import com.example.oregonmicrobreweries.presentation.components.BreweryItem


@Composable
fun BreweryScreen() {
    Column() {
        dummyBreweries.forEach{ brewery ->
            BreweryItem(brewery)

        }
    }
}