package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomText(
    modifier: Modifier = Modifier,
    text : String
) {
    Text(
        modifier = modifier.padding(top = 28.dp),
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.W700,
            color = Color(0xff303030).copy(0.8f)
        )
    )
}