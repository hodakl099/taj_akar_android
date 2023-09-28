package com.mahmoud.tajaarandroid.presentation.details.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun DetailCustomText(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontWeight = FontWeight.W700,
            color = Color.Black.copy(0.8f),
            textAlign = TextAlign.Start,
            fontSize = 16.sp
        )
    )
}