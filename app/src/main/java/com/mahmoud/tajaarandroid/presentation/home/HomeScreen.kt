package com.mahmoud.tajaarandroid.presentation.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.common_components.BaseScreen
import com.mahmoud.tajaarandroid.presentation.home.components.Category
import com.mahmoud.tajaarandroid.presentation.home.components.CategoryItem
import com.mahmoud.tajaarandroid.presentation.home.components.HomeHeader
import com.mahmoud.tajaarandroid.presentation.util.Route
import com.mahmoud.tajaarandroid.presentation.util.chunkedCategories


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    innerPadding : PaddingValues,
    navController: NavHostController
) {
        BaseScreen(
            modifier = modifier.padding(innerPadding),
            headerContent = {
                HomeHeader(
                    modifier = Modifier.padding(bottom = 20.dp),
                    imageRes = R.drawable.women,
                    headerText = "Tripoli, Libya"
                )
            },
            lazyColumnContent = {
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
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom = 16.dp, start = 24.dp, end = 24.dp),
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
                items(chunkedCategories) { pair ->
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        pair.forEach { category ->
                            CategoryItem(
                                modifier = Modifier.weight(1f),
                                category = category,
                                onClick = {
                                    navController.navigate(Route.FILTER)
                                }
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

