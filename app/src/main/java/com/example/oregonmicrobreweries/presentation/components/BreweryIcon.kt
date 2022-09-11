package com.example.oregonmicrobreweries.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun BreweryIcon(icon: ImageVector, modifier: Modifier, onClick: () -> Unit = {}) {

    Image(
        imageVector = icon,
        contentDescription = "Brewery Icon",
        modifier = modifier
            .padding(8.dp)
            .clickable { onClick() }
        )

    
}