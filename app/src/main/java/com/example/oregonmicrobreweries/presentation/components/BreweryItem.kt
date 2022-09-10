package com.example.oregonmicrobreweries.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BreweryItem() {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp)
        ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
            ) {
            BreweryIcon(
                modifier = Modifier
                    .weight(0.15f)
            )
            BreweryDetails(
                modifier = Modifier
                .weight(0.85f)
            )

        }

    }
}

