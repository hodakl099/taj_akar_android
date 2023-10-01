package com.mahmoud.tajaarandroid.presentation.search.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahmoud.tajaarandroid.ui.theme.TextColor
import com.mahmoud.tajaarandroid.ui.theme.snowDrift

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value : String,
    onValueChange : (String) -> Unit

) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clip(RoundedCornerShape(14.dp))
            .background(snowDrift),
    ) {
        if (value.isEmpty()) {
            Text(
                modifier = Modifier.padding(21.dp),
                text = "Search...",
                style = TextStyle(
                    color = TextColor.copy(0.6f),
                    fontWeight = FontWeight.W400,
                    fontSize = 14.sp,
                )
            )
        }
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = {
                    //TODO()
                }
            ),
            modifier = Modifier.fillMaxWidth().padding(top = 21.dp, start = 21.dp, bottom = 21.dp),
            textStyle = TextStyle(color = Color.Black),
            singleLine = true,
            maxLines = 1
        )
    }
}