package com.mahmoud.tajaarandroid.presentation.details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.ui.theme.TextColor

@Composable
fun CustomSheetRow(
    modifier : Modifier = Modifier,
    leadingText : String,
    trailingText : String,
) {
    Row(
        modifier = modifier.fillMaxWidth().padding(top = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = leadingText,
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.W700,
                color = TextColor.copy(0.8f)
            )
        )
        Text(
            text = trailingText,
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.W400,
                color = TextColor.copy(0.6f)
            )
        )
    }
}