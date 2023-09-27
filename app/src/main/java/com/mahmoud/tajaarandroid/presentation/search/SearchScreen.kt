package com.mahmoud.tajaarandroid.presentation.search

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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomLazyRow
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterItemData
import com.mahmoud.tajaarandroid.presentation.home.components.CategoryItem
import com.mahmoud.tajaarandroid.presentation.search.components.SearchHeader
import com.mahmoud.tajaarandroid.presentation.util.categories
import com.mahmoud.tajaarandroid.presentation.util.chunkedCategories

@Composable
fun SearchScreen(
    modifier : Modifier = Modifier
) {
    var searchText by remember {
        mutableStateOf("")
    }
    val categories = listOf(
        FilterItemData( "Any"),
        FilterItemData( "Apartment"),
        FilterItemData( "Agricultural"),
        FilterItemData( "Urban"),
        FilterItemData( "Office"),
    )
    Box(modifier = Modifier.fillMaxSize()) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {
            item {
                Spacer(
                    modifier =
                    Modifier.height(144.dp)
                )
            }
            item {
                CustomLazyRow(
                    itemsList = categories,
                    seperator = false ,
                    onClick = {}
                )
            }
            items(chunkedCategories) {pair ->
                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)

                ){
                    pair.forEach { category ->
                        CategoryItem(
                            modifier = Modifier.weight(1f),
                            category = category
                        )
                        if (pair.size < 2) {
                            Box(modifier = Modifier.background(Color.Transparent))
                        }
                    }
                }

            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 54.dp, start = 24.dp, end = 24.dp)
        ){
            SearchHeader(
                value = searchText,
                onValueChange = { newText ->
                    searchText = newText
                },
                onDeleteClick = {
                    //TODO()
                }
            )
        }
    }
}