package com.mahmoud.tajaarandroid.presentation.filter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.presentation.components.BaseScreen
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterHeader
import com.mahmoud.tajaarandroid.presentation.home.components.CategoryItem
import com.mahmoud.tajaarandroid.presentation.util.chunkedCategories

@Composable
fun FilteredScreen() {
    BaseScreen(
        headerContent = { modifier ->
            FilterHeader(
                headerText = "Filtered Category"
            )
        },
        headerModifier = Modifier .padding(top = 54.dp, start = 24.dp, end = 24.dp),
        lazyColumnContent = {
            item {
                Spacer(modifier = Modifier.height(133.dp))
            }
            items(chunkedCategories) { pair ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    pair.forEach { category ->
                        CategoryItem(
                            modifier = Modifier.weight(1f),
                            category = category
                        )
                        if (pair.size < 2) {
                            Box(modifier = Modifier.weight(1f))
                        }
                    }
                }
            }
        }
    )
}