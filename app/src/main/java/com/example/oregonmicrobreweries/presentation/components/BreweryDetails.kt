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
fun BreweryDetails( title: String, description: String,modifier: Modifier) {
    Column(
        modifier = Modifier

    ) {
        Text(text = title,
            style = MaterialTheme.typography.h6
        )
        CompositionLocalProvider(
            LocalContentAlpha provides
                    ContentAlpha.medium) {
            Text(text = description,
                style = MaterialTheme.typography.body2)
        }
    }

}

@Preview(
    showBackground = true
)
@Composable
fun BreweryDetailsPreview() {
    BreweryDetails(
        title = "Test",
        description = "description",
        modifier = Modifier
    )
}