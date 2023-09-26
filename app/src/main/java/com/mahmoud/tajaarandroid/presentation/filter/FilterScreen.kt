package com.mahmoud.tajaarandroid.presentation.filter

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomLazyRow
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomText
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterHeader
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterItem
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterItemData
import com.mahmoud.tajaarandroid.presentation.filter.components.MinMaxButton

@Composable
fun FilterScreen(
    modifier: Modifier = Modifier
) {

    //TODO() remove this to data layer for api calls.
    val locations = listOf(
        FilterItemData(
            "Tajura"
        ),
        FilterItemData(
            "Bengazhi"
        ),
        FilterItemData(
            "Tripoli"
        ),
        FilterItemData(
            "Tunisia"
        ),
        FilterItemData(
            "Dubai"
        ),
        FilterItemData(
            "Kuala lumpur",
            true
        ),
        FilterItemData(
            "Jakarta"
        ),
        FilterItemData(
            "Tunis capital"
        )
    )

    val paymentMethods = listOf(
        FilterItemData(
            itemText = "Pay in the spot",
            isSelected = true,
        ),
        FilterItemData(
            itemText = "Home Mortgage",
            isSelected = false,
        )
    )

    val prices = listOf(
        FilterItemData(
            itemText = "$0-$300",
            isSelected = true
        ),
        FilterItemData(
            itemText = "$300-$500",
        ),
        FilterItemData(
            itemText = "$500-$800",
        ),
        FilterItemData(
            itemText = "$800-$1200",
        ),
        FilterItemData(
            itemText = "$1200-$1500",
        ),
    )

    val properties = listOf(
        FilterItemData(
            itemText = "Urban",
        ),
        FilterItemData(
            itemText = "Apartment",
            isSelected = true
        ),
        FilterItemData(
            itemText = "Agricultural"
        ),
        FilterItemData(
            itemText = "Office"
        ),

    )

    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {
            item {
                CustomText(
                    modifier = Modifier.padding(top = 133.dp),
                    text = "Location"
                )
            }
            item {
                CustomLazyRow(locations) {
                    // TODO()
                }
            }
            item {
                CustomText(
                    text = "Payment Method"
                )
            }
            item {
                CustomLazyRow(paymentMethods) {
                    // TODO()
                }
            }
            item {
                CustomText(text = "Price Monthly")
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 18.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    MinMaxButton(
                        buttonText = "Min"
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.convert),
                        contentDescription = null,
                        tint = Color.Unspecified
                    )
                    MinMaxButton(buttonText = "Max")
                }
            }
            item {
                CustomLazyRow(prices) {
                    // TODO()
                }
            }
            item {
                CustomLazyRow(properties) {
                    // TODO()
                }
            }
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