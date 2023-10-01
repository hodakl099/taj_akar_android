package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.ui.theme.TextColor

@Composable
fun CustomText(
    modifier: Modifier = Modifier,
    text : String,
    textUnit : TextUnit
) {
    Text(
        modifier = modifier.padding(top = 28.dp),
        text = text,
        style = TextStyle(
            fontSize = textUnit,
            fontWeight = FontWeight.W700,
            color = TextColor.copy(0.8f)
        )
    )
}