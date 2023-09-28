package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomLazyRow(
    modifier: Modifier = Modifier,
    itemsList : List<FilterItemData>, onClick : () -> Unit,
    seperator : Boolean = true
) {
    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .padding(top = 18.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(itemsList) {item ->
            FilterItem(
                onClick = onClick,
                itemText = item.itemText,
                isSelected = item.isSelected
            )
        }
    }
    if(seperator)
    Divider(
        modifier = Modifier.padding(start = 24.dp,end = 24.dp,top = 28.dp),
        color = Color.Black.copy(0.05f),
        thickness = 1.dp
    )

}