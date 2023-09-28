package com.mahmoud.tajaarandroid.presentation.details

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.presentation.common_components.BaseScreen
import com.mahmoud.tajaarandroid.presentation.details.components.DetailsHeader

@Composable
fun DetailScreen() {
    BaseScreen(
        headerContent = {
            DetailsHeader(
                modifier = Modifier.padding(top = 32.dp, start = 24.dp, end = 24.dp, bottom = 44.dp),
            )
        },
        lazyColumnContent = {}
    )
}