package com.mahmoud.tajaarandroid.presentation.authentication.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionButton(
    modifier: Modifier = Modifier,
    textButton : String,
    containerColor : Color,
    textColor : Color,
    onClick : () -> Unit = {}
) {
    Button(
        modifier = modifier
            .border(
                width = 1.dp,
                color = Color.Black.copy(0.1f),
                shape = RoundedCornerShape(14.dp)
            )
            .height(54.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor
        ),
        shape = RoundedCornerShape(14.dp)
    ) {
            Text(
                text = textButton,
                fontSize = 14.sp,
                color = textColor,
                fontWeight = FontWeight.W400
            )
    }
}