package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.ui.theme.BlueLotus


@Composable
fun FilterItem(
    onClick: () -> Unit,
    isSelected: Boolean = false,
    itemText : String
) {
    Button(
        onClick = onClick,
        shape = RoundedCornerShape(10.dp),
        contentPadding = PaddingValues(13.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) BlueLotus else Color.Transparent
        ),
        border = BorderStroke(width = if (isSelected) 1.dp else 0.dp, color = Color.Gray)
    ) {
        Text(
            text = itemText,
            fontSize = 12.sp,
            fontWeight = FontWeight.W700,
            color = if (isSelected) MaterialTheme.colorScheme.onPrimary else Color(0xff303030).copy(0.8f)
        )
    }
}