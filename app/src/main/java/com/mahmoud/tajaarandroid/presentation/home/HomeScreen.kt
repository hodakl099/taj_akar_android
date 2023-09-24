package com.mahmoud.tajaarandroid.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.home.components.Category
import com.mahmoud.tajaarandroid.presentation.home.components.HomeHeader

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {
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
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Category(
                        iconRes = R.drawable.condo,
                        categoryName = "Condo"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Category(
                        iconRes = R.drawable.resort,
                        categoryName = "Resort"
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp, bottom = 54.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Category(
                        iconRes = R.drawable.ofiice,
                        categoryName = "Office"
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Category(
                        iconRes = R.drawable.urban,
                        categoryName = "Urban"
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