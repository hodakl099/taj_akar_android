package com.mahmoud.tajaarandroid.presentation.details.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.presentation.common_components.CustomActionIcon

@Composable
fun DetailsHeader(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CustomActionIcon(iconRes = R.drawable.arrowleft)
        
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ){
            CustomActionIcon(iconRes = R.drawable.share,)
            CustomActionIcon(iconRes = R.drawable.archiveadd, hasWhiteBackground = true, hasBorder = true)
            CustomActionIcon(iconRes = R.drawable.more, hasWhiteBackground = true, hasBorder =  true )
        }
    }
}