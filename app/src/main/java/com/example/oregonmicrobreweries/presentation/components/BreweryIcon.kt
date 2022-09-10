package com.example.oregonmicrobreweries.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.oregonmicrobreweries.R

@Composable
fun BreweryIcon(modifier: Modifier) {
    Image(painter = painterResource(
        id = R.drawable.beer250),
        contentDescription = "Beer mug",
        modifier = modifier.padding(8.dp)
        )
    
}