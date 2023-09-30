package com.mahmoud.tajaarandroid.presentation.saved

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.common_components.BaseScreen
import com.mahmoud.tajaarandroid.presentation.home.components.CategoryItem
import com.mahmoud.tajaarandroid.presentation.saved.components.SavedHeader
import com.mahmoud.tajaarandroid.presentation.util.chunkedCategories

@Composable
fun SavedCategoriesScreen() {
    BaseScreen(
        headerContent = {
            SavedHeader(
                modifier = Modifier.padding(bottom = 24.dp),
               imageRes = R.drawable.women ,
               headerText = "Save Your\ndreams house"
           )
        },
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