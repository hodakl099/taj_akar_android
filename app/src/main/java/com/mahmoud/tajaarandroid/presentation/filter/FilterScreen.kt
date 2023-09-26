package com.mahmoud.tajaarandroid.presentation.filter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterHeader
import com.mahmoud.tajaarandroid.presentation.util.ScreenWidth

@Composable
fun FilterScreen(
    modifier: Modifier = Modifier
) {

    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier =  Modifier.fillMaxSize()
        ) {

        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 54.dp, start = 24.dp, end = 24.dp)
        ) {
            FilterHeader()
        }
    }
}