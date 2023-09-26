package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MinMaxButton(
    buttonText : String,
) {
    Button(
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xffF9F9F9)
        ),
        contentPadding = PaddingValues(horizontal = 55.dp, vertical = 16.dp),
        onClick = { /*TODO*/ }
    ) {
        Text(
            text = buttonText,
            style = TextStyle(
                color = Color(0xff303030).copy(0.4f),
                fontSize = 14.sp,
                fontWeight = FontWeight.W700
            )
        )

    }
}