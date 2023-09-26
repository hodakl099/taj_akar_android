package com.mahmoud.tajaarandroid.presentation.filter.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.util.ScreenWidth

@Composable
fun FilterHeader(
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp, start = 16.dp),
        verticalAlignment = CenterVertically,
    ){
        IconButton(
            modifier = Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(10.dp))
                .border(
                    width = 0.dp,
                    color = Color.Unspecified,
                    shape = RoundedCornerShape(10.dp)
                ),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = Color(0xFFF9F9F9)
            ),
            onClick = { /*TODO*/ }
        ) {
            Icon(
                modifier = Modifier.size(14.dp),
                painter = painterResource(id = R.drawable.arrowleft),
                contentDescription = null
            )
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .align(CenterVertically)
        ) {
            Text(
                modifier = Modifier.align(Center),
                text = "Filter",
                fontSize = 18.sp,
                fontWeight = FontWeight.W700,
                textAlign = TextAlign.Center
            )
        }
        //an invisible box to balance the space between the items in the row.
        Box(modifier = Modifier.size(44.dp))
    }

}