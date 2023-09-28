package com.mahmoud.tajaarandroid.presentation.common_components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp



@Composable
fun BaseScreen(
    modifier: Modifier = Modifier,
    headerContent : @Composable (Modifier) -> Unit,
    lazyColumnContent: LazyListScope.() -> Unit,
    headerModifier : Modifier = Modifier
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            content = lazyColumnContent
        )
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background)
        ) {
            Column(
                modifier = headerModifier
                    .fillMaxWidth()
                    .background(Color.White)
            ) {
                headerContent(modifier)
            }

        }
    }
}