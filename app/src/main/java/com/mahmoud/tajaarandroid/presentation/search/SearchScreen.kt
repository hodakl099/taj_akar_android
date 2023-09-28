package com.mahmoud.tajaarandroid.presentation.search

import androidx.compose.animation.Crossfade
import androidx.compose.animation.core.tween
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.components.BaseScreen
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomLazyRow
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterItemData
import com.mahmoud.tajaarandroid.presentation.home.components.CategoryItem
import com.mahmoud.tajaarandroid.presentation.search.components.SearchHeader
import com.mahmoud.tajaarandroid.presentation.util.IconState
import com.mahmoud.tajaarandroid.presentation.util.chunkedCategories

@Composable
fun SearchScreen() {
    var searchText by remember {
        mutableStateOf("")
    }

    var iconState by remember {
        mutableStateOf(IconState.SEARCH)
    }
    val categories = listOf(
        FilterItemData("Any", true),
        FilterItemData("Apartment"),
        FilterItemData("Agricultural"),
        FilterItemData("Urban"),
        FilterItemData("Office"),
    )

    BaseScreen(
        headerModifier = Modifier.padding(top = 32.dp, start = 24.dp, end = 24.dp),
        headerContent = {
                SearchHeader(
                    value = searchText,
                    onValueChange = { newText ->
                        searchText = newText
                        iconState = if (searchText.isNotEmpty()) {
                            IconState.DELETE
                        } else {
                            IconState.SEARCH
                        }
                    },
                    onDeleteClick = {
                        searchText = ""
                        iconState = IconState.SEARCH
                    },
                    icon = {
                        Crossfade(
                            targetState = iconState,
                            label = "ICON STATE",
                            animationSpec = tween(500)
                        ) { state ->
                            when (state) {
                                IconState.SEARCH -> {
                                    Icon(
                                        painter = painterResource(
                                            id = R.drawable.search
                                        ),
                                        contentDescription = "Close",
                                        tint = Color.Unspecified,
                                    )
                                }
                                IconState.DELETE -> {
                                    Icon(
                                        painter = painterResource(
                                            id = R.drawable.close_circle
                                        ),
                                        contentDescription = "Close",
                                        tint = Color.Unspecified,
                                    )
                                }
                            }
                        }

                    }
                )

        },
        lazyColumnContent = {
            item {
                Spacer(
                    modifier =
                    Modifier.height(132.dp)
                )
            }
            item {
                CustomLazyRow(
                    modifier = Modifier.padding(bottom = 28.dp),
                    itemsList = categories,
                    seperator = false,
                    onClick = {}
                )
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
                            Box(
                                modifier = Modifier
                                    .background(Color.Transparent)
                                    .weight(1f)
                            )
                        }
                    }
                }

            }
        }
    )
//    Box(modifier = Modifier.fillMaxSize()) {
//        LazyColumn(
//            modifier = modifier
//                .fillMaxSize()
//                .padding(horizontal = 24.dp)
//        ) {
//
//
//        }
//    }
}