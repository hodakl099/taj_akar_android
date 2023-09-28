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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.ActionButton
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomLazyRow
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomText
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterHeader
import com.mahmoud.tajaarandroid.presentation.filter.components.FilterItemData
import com.mahmoud.tajaarandroid.presentation.filter.components.MinMaxButton

@Composable
fun FilterSettingsScreen(
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

    val bedRooms = listOf(
        FilterItemData(
            itemText = "Any",
            isSelected = true
        ),
        FilterItemData(
            itemText = "1",
        ),
        FilterItemData(
            itemText = "2",

            ),
        FilterItemData(
            itemText = "3"
        ),
        FilterItemData(
            itemText = "+4",
        ),
    )
    val bathRooms = listOf(
        FilterItemData(
            itemText = "Any",
            isSelected = true
        ),
        FilterItemData(
            itemText = "1",
        ),
        FilterItemData(
            itemText = "2",

            ),
        FilterItemData(
            itemText = "3"
        ),
        FilterItemData(
            itemText = "+4",
        ),
    )

    val amenities = listOf(
        FilterItemData(
            itemText = "Any",
            isSelected = true
        ),
        FilterItemData(
            itemText = "Amenties",
        ),
        FilterItemData(
            itemText = "UnAmenties",

            ),
    )


    val furnished = listOf(
        FilterItemData(
            itemText = "Any",
            isSelected = true
        ),
        FilterItemData(
            itemText = "Furnished",
        ),
        FilterItemData(
            itemText = "Unfurnished",
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
                CustomLazyRow(
                    itemsList = locations,
                    onClick = {}
                )
            }
            item {
                CustomText(
                    text = "Payment Method"
                )
            }
            item {
                CustomLazyRow(
                    itemsList = paymentMethods,
                    onClick = {}
                )
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
                CustomLazyRow(
                    itemsList = prices,
                    onClick = {}
                )
            }
            item {
                CustomText(
                    text = "Property Type"
                )
            }
            item {
                CustomLazyRow(
                    itemsList = properties,
                    onClick = {

                    })
            }

            item {
                CustomText(
                    text = "Bedrooms"
                )
            }
            item {
                CustomLazyRow(
                    itemsList = bedRooms,
                    onClick = {

                    }
                )
            }

            item {
                CustomText(
                    text = "Bathrooms"
                )
            }
            item {
                CustomLazyRow(
                    itemsList = bathRooms,
                    onClick = {}
                )
            }
            item {
                CustomText(
                    text = "Amenties"
                )
            }
            item {
                CustomLazyRow(
                    itemsList = amenities,
                    onClick = {}
                )
            }
            item {
                CustomText(
                    text = "Furnishing"
                )
            }
            item {
                CustomLazyRow(
                    itemsList = furnished,
                    onClick = {}
                )
            }
            item {
                ActionButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 42.dp),
                    textButton = "Filter",
                    containerColor = MaterialTheme.colorScheme.onPrimary,
                    textColor = Color.White
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 54.dp, start = 24.dp, end = 24.dp)
        ) {
            FilterHeader(
                headerText = "Filter"
            )
        }
    }
}