package com.mahmoud.tajaarandroid.presentation.home

import androidx.compose.foundation.Image
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
import com.mahmoud.tajaarandroid.presentation.home.components.Category
import com.mahmoud.tajaarandroid.presentation.home.components.CategoryData
import com.mahmoud.tajaarandroid.presentation.home.components.HomeHeader


@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {


    //TODO() this is a dummy data, this will be fetched from a web server.
    val categories = listOf(
        CategoryData(
            name =  "Alkwateb resort bir alalim.",
            type = "Resort",
            location = "Tajura, Tripoli",
            price = 2455.33
        ),
                CategoryData(
                name =  "Alkwateb resort bir alalim.",
        type = "Resort",
        location = "Tajura, Tripoli",
        price = 2455.33
    ),
    CategoryData(
        name =  "Alkwateb resort bir alalim.",
        type = "Resort",
        location = "Tajura, Tripoli",
        price = 2455.33
    ),
    CategoryData(
        name =  "Alkwateb resort bir alalim.",
        type = "Resort",
        location = "Tajura, Tripoli",
        price = 2455.33
    ),
    CategoryData(
        name =  "Alkwateb resort bir alalim.",
        type = "Resort",
        location = "Tajura, Tripoli",
        price = 2455.33
    ),
    CategoryData(
        name =  "Alkwateb resort bir alalim.",
        type = "Resort",
        location = "Tajura, Tripoli",
        price = 2455.33
    ),
    CategoryData(
        name =  "Alkwateb resort bir alalim.",
        type = "Resort",
        location = "Tajura, Tripoli",
        price = 2455.33
    )
    )


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp)
        ) {
            item {
                Spacer(modifier = Modifier.height(86.dp))
            }
            item {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(486.dp)
                        .padding(top = 32.dp),
                    painter = painterResource(id = R.drawable.villa),
                    contentDescription = "Villa image"
                )
            }
            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly

                ) {
                    Category(
                        iconRes = R.drawable.condo,
                        categoryName = "Condo"
                    )
                    Category(
                        iconRes = R.drawable.resort,
                        categoryName = "Resort"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, bottom = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Category(
                        iconRes = R.drawable.office,
                        categoryName = "Office"
                    )
                    Category(
                        iconRes = R.drawable.urban,
                        categoryName = "Urban"
                    )
                }
            }
            item {
                Row (
                    modifier = Modifier.fillMaxWidth()
                        .padding(bottom = 54.dp, start = 24.dp, end = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Recommended",
                        style = TextStyle(
                            fontWeight = FontWeight.W700,
                            color = Color.Black.copy(0.8f),
                            fontSize = 16.sp
                        ),
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.candle),
                        contentDescription = null
                    )
                }

            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(top = 54.dp, start = 24.dp, end = 24.dp)
        ) {
            HomeHeader(
                modifier = Modifier.padding(bottom = 16.dp),
                imageRes = R.drawable.women
            )
        }
    }
}