package com.example.oregonmicrobreweries.presentation.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ContentAlpha
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BreweryDetails(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(text = "Alesong Brewing & Blending",
            style = MaterialTheme.typography.h6)
        CompositionLocalProvider(
            LocalContentAlpha provides
                    ContentAlpha.medium) {
            Text(text = "We approach brewing like a musician composing a song\n" +
                    "Each beer begins with an inspiration: from nature, food, or an unforgettable experience\n" +
                    "Production is patient, personal and reflective; the vision evolves until it is brought to life in the glass\n" +
                    "Like the song, each beer is our expression, but the enjoyment and interpretation is yours",
                style = MaterialTheme.typography.body2)
        }
    }

}

@Preview(
    showBackground = true
)

@Composable
fun BreweryDetailsPreview() {
    BreweryDetails(modifier = Modifier)
}