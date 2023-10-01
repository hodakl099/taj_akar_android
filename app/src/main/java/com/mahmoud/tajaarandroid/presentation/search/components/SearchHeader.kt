package com.mahmoud.tajaarandroid.presentation.search.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mahmoud.tajaarandroid.R
import com.mahmoud.tajaarandroid.ui.theme.snowDrift
import com.mahmoud.tajaarandroid.ui.theme.valentineRed
import kotlinx.coroutines.launch

@Composable
fun SearchHeader(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    onDeleteClick : () -> Unit,
    icon : @Composable () -> Unit
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        CustomTextField(
            modifier = Modifier.weight(1f),
            value = value,
            onValueChange = onValueChange
        )
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(14.dp))
                .background(
                    if (value.isNotEmpty())
                      valentineRed.copy(0.1f)
                    else
                       snowDrift
                ),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                modifier = Modifier
                    .size(59.dp)
                    .padding(18.dp),
                onClick = onDeleteClick,
                enabled = value.isNotEmpty()

            ) {
                icon()
            }
        }
    }
}
