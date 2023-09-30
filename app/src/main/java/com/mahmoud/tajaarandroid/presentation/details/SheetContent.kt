package com.mahmoud.tajaarandroid.presentation.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.ActionButton
import com.mahmoud.tajaarandroid.presentation.details.components.CustomSheetRow
import com.mahmoud.tajaarandroid.presentation.details.components.RatingComponent
import com.mahmoud.tajaarandroid.presentation.filter.components.CustomDivider
import com.mahmoud.tajaarandroid.ui.theme.BlueLotus
import kotlinx.coroutines.launch

@Composable
fun DetailSheetContent(
    modifier : Modifier = Modifier
) {
    Box(modifier = modifier.fillMaxSize()) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 24.dp, start = 24.dp, end = 24.dp)
        ) {
            item {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Ayana Home Stay\nWith Family",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.W700,
                            color = Color(0xff303030).copy(0.8f),
                            letterSpacing = 0.48.sp
                        )
                    )
                    Box(
                        modifier = Modifier.weight(1f)
                    ) {
                        RatingComponent(
                            modifier = Modifier.align(Alignment.TopEnd)
                        )
                    }
                }
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "Old Sukabumi Hwy No 12",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.W400,
                        color = Color.Black.copy(0.8f)
                    )
                )
            }
            item {
                Image(
                    modifier = Modifier
                        .padding(top = 24.dp)
                        .fillMaxWidth()
                        .height(238.dp),
                    painter = painterResource(id = R.drawable.buynowimage),
                    contentDescription = null,
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier
                            .padding(top = 24.dp),
                        text = "View Details",
                        style = TextStyle(
                            color = BlueLotus.copy(0.8f),
                            fontSize = 14.sp,
                            fontWeight = FontWeight.W700,
                        ),
                    )
                }
            }
            item {
                CustomDivider(
                    modifier = Modifier.padding(top = 24.dp)
                )
                CustomSheetRow(
                    leadingText = "Price",
                    trailingText = "$24666"
                )
                CustomDivider(
                    modifier = Modifier.padding(top = 24.dp)
                )
            }
            item {
                CustomSheetRow(
                    leadingText = "Payment Method",
                    trailingText = "Cash"
                )
            }
            item {
                ActionButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp),
                    textButton = "Buy now",
                    containerColor = MaterialTheme.colorScheme.onPrimary,
                    textColor = Color.White,
                    onClick = {
                        //TODO()
                    }
                )
            }
        }
    }
}