package com.mahmoud.tajaarandroid.presentation.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SheetContent(
    modifier : Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(top = 24.dp, start = 24.dp,end = 24.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "Ayana Home Stay\nWith Family",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.W700,
                            color = Color(0xff303030).copy(0.8f),
                            letterSpacing = 0.48.sp
                        )
                    )

                }
            }
        }
    }
}