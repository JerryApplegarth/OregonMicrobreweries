package com.example.oregonmicrobreweries.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.oregonmicrobreweries.data.local.Brewery
import com.example.oregonmicrobreweries.ui.theme.cardBackground

@Composable
fun BreweryItem(
    item: Brewery
) {

    Card(
        elevation = 4.dp,
        modifier = Modifier
            .padding(8.dp),
        shape = MaterialTheme.shapes.large,
        backgroundColor = MaterialTheme.colors.cardBackground

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
                item.title,
                item.description,
                Modifier.weight(0.85f)
            )

        }

    }
}

