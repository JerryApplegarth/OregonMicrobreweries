package com.example.oregonmicrobreweries.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Place
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.oregonmicrobreweries.data.local.Brewery
import com.example.oregonmicrobreweries.ui.theme.cardBackground

@Composable
fun BreweryItem(
    item: Brewery, onClick: (id: Int) -> Unit
) {
    val icon = if (item.isFavorite)
        Icons.Filled.Favorite
    else
        Icons.Filled.FavoriteBorder

    Card(
        elevation = 6.dp,
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
            BreweryIcon(Icons.Filled.Place, Modifier.weight(0.15f))
            BreweryDetails(item.title, item.description, Modifier.weight(0.7f))
            BreweryIcon(Icons.Default.Favorite, Modifier.weight(0.15f)) {
                onClick(item.id)
            }

        }

    }
}

