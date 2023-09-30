package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomDivider(
    modifier: Modifier = Modifier
) {
    Divider(
        modifier = modifier,
        color = Color.Black.copy(0.05f),
        thickness = 1.dp
    )
}