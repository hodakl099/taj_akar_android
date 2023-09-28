package com.mahmoud.tajaarandroid.presentation.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.authentication.components.ActionButton
import com.mahmoud.tajaarandroid.presentation.common_components.BaseScreen
import com.mahmoud.tajaarandroid.presentation.common_components.CustomActionIcon
import com.mahmoud.tajaarandroid.presentation.details.components.DescriptionCard
import com.mahmoud.tajaarandroid.presentation.details.components.DescriptionText
import com.mahmoud.tajaarandroid.presentation.details.components.DetailCustomText
import com.mahmoud.tajaarandroid.presentation.details.components.DetailsHeader
import com.mahmoud.tajaarandroid.presentation.details.components.UtilityCard
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun DetailScreen() {
    var state = rememberModalBottomSheetState(ModalBottomSheetValue.Expanded)

    val scope = rememberCoroutineScope()

    val dummyutilities = listOf(
        UtilityData(
            iconRes = R.drawable.urban,
            utilityText = "Hospital",
            utilityDistance = "3 minutes"
        ),
        UtilityData(
            iconRes = R.drawable.building4,
            utilityText = "School",
            utilityDistance = "15 minutes"
        ),
        UtilityData(
            iconRes = R.drawable.market,
            utilityText = "Market",
            utilityDistance = "4 minutes"
        ),
        UtilityData(
            iconRes = R.drawable.airplane,
            utilityText = "Airplane",
            utilityDistance = "20 minutes"
        ),
        UtilityData(
            iconRes = R.drawable.golf,
            utilityText = "Golf",
            utilityDistance = "18 minutes"
        ),
        UtilityData(
            iconRes = R.drawable.bank,
            utilityText = "Embassy",
            utilityDistance = "12 minutes"
        ),
    )

    val dummyDiscription = listOf(
        DescriptionData(
            iconRes = R.drawable.layer,
            descriptionText = "2 Bedroom",
        ),
        DescriptionData(
            iconRes = R.drawable.commandsquare,
            descriptionText = "2 bathrooms",
        ),
        DescriptionData(
            iconRes = R.drawable.maximize,
            descriptionText = "1200 SQFT",
        ),
        DescriptionData(
            iconRes = R.drawable.house,
            descriptionText = "Flat",
        ),
    )

    val dummyCallCenter = listOf(
        DescriptionData(
            iconRes = R.drawable.call,
            descriptionText = "+218-0924871520",
        ),
        DescriptionData(
            iconRes = R.drawable.sms_search,
            descriptionText = "mahmoud.alkateb22@gmail.com",
        ),
        DescriptionData(
            iconRes = R.drawable.locationcall,
            descriptionText = "Tajura, Tripoli",
        ),

    )


    BoxWithConstraints {
        val sheetHeight = this.constraints.maxHeight * 0.85f
        ModalBottomSheetLayout(
            sheetContent = {
                SheetContent(
                    modifier = Modifier.height(with(LocalDensity.current) {sheetHeight.toDp()})
                )
            },
            sheetState = state,
            sheetShape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
            scrimColor = Color(0xFFC4C4C4).copy(0.3f)
        ) {
            BaseScreen(
                headerContent = {
                    DetailsHeader(
                        modifier = Modifier.padding(
                            top = 32.dp,
                            start = 24.dp,
                            end = 24.dp,
                            bottom = 24.dp
                        ),
                    )
                },
                lazyColumnContent = {
                    item {
                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(600.dp)
                                .padding(top = 133.dp),
                            painter = painterResource(id = R.drawable.detailimage),
                            contentDescription = null
                        )
                    }
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 34.dp),
                            verticalArrangement = Arrangement.SpaceAround,
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(
                                    text = "Ayana Home Stay\nWith Family",
                                    style = TextStyle(
                                        fontSize = 24.sp,
                                        fontWeight = FontWeight.W700,
                                        color = Color.Black.copy(0.8f)
                                    )
                                )
                                Box(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(13.dp))
                                        .background(
                                            Color(0xffF2994A).copy(0.1f)
                                        )
                                ) {
                                    Row(
                                        modifier = Modifier.padding(8.dp)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.star),
                                            contentDescription = null,
                                            tint = Color.Unspecified
                                        )
                                        Spacer(modifier = Modifier.width(5.dp))
                                        Text(
                                            text = "4.9",
                                            style = TextStyle(
                                                fontSize = 13.sp,
                                                fontWeight = FontWeight.W700,
                                                color = Color(0xffF2994A)
                                            )
                                        )
                                    }
                                }

                            }
                            Spacer(modifier = Modifier.height(8.dp))
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Text(
                                    text = "Old Sukabumi Hwy No 12",
                                    style = TextStyle(
                                        fontSize = 14.sp,
                                        fontWeight = FontWeight.W400,
                                        color = Color.Black.copy(0.8f)
                                    )
                                )
                                CustomActionIcon(
                                    iconRes = R.drawable.call_call,
                                    backgroundColor = Color(0xff6FCF97).copy(0.1f),
                                    hasWhiteBackground = true
                                )
                            }
                        }
                    }
                    item {
                        Spacer(modifier = Modifier.height(32.dp))
                        DetailCustomText(text = "Introduction")
                        Spacer(modifier = Modifier.height(8.dp))
                        DescriptionText(
                            paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed arcu quam laoreet aliquet amet, ipsum mi. In molestie fames mollis feugiat ultricies ultrices integer in. Vulputate"
                        )
                    }
                    item {
                        Spacer(modifier = Modifier.height(32.dp))
                        DetailCustomText("Utilities")
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    items(dummyutilities) { utility ->
                        UtilityCard(
                            utilityText = utility.utilityText,
                            utilityIcon = utility.iconRes,
                            utilityDistance = utility.utilityDistance
                        )
                    }
                    item {
                        Spacer(modifier = Modifier.height(32.dp))
                        DetailCustomText("Description")
                        Spacer(modifier = Modifier.height(8.dp))
                        DescriptionText(
                            paragraph = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed arcu quam laoreet aliquet amet, ipsum mi. In molestie fames mollis feugiat ultricies ultrices integer in. Vulputate"
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    items(dummyDiscription) { description ->
                        DescriptionCard(
                            descriptionText = description.descriptionText,
                            descriptionIcon = description.iconRes
                        )
                    }
                    item {
                        Spacer(modifier = Modifier.height(32.dp))
                        DetailCustomText("Call Center")
                        Spacer(modifier = Modifier.height(16.dp))
                    }
                    items(dummyCallCenter) { callCenter ->
                        DescriptionCard(
                            descriptionText = callCenter.descriptionText,
                            descriptionIcon = callCenter.iconRes
                        )
                    }
                    item {
                        ActionButton(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 32.dp),
                            textButton = "Request an inquiry",
                            containerColor = MaterialTheme.colorScheme.onPrimary,
                            textColor = Color.White,
                            onClick = {
                                scope.launch {
                                    state.show()
                                }
                            }
                        )
                    }
                }
            )
        }
    }
}


//TODO() remove this data class to domain layer
data class UtilityData(
    val iconRes : Int,
    val utilityText : String,
    val utilityDistance : String
)

//TODO() remove this data class to domain layer
data class DescriptionData(
    val iconRes : Int,
    val descriptionText : String,
)