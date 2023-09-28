package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.common_components.CustomActionIcon

@Composable
fun FilterHeader(
    modifier: Modifier = Modifier,
    headerText : String
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
      CustomActionIcon(iconRes = R.drawable.arrowleft)
        Box(
            modifier = Modifier
                .weight(1f)
                .align(CenterVertically),
        ) {
            Text(
                modifier =Modifier.align(Center),
                text = headerText,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W700,
                    textAlign = TextAlign.Center,
                )
            )
        }

        // an invisible box to distribute the Composable equally.
        Box(modifier = Modifier.size(44.dp))

    }

}