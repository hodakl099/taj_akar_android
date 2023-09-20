package com.mahmoud.tajaarandroid.presentation.authentication.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import com.mahmoud.tajaarandroid.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(value: TextFieldValue, onValueChange: (TextFieldValue) -> Unit) {
    OutlinedTextField(
        modifier = Modifier
            .width(327.dp)
            .height(59.dp)
            .background(Color(0xFFF9F9F9), RoundedCornerShape(14.dp))
            .fillMaxHeight()
            .wrapContentHeight(Alignment.CenterVertically),
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        maxLines = 1,
        singleLine = true,
        leadingIcon = {
            Icon(painter = painterResource(id = R.drawable.ellipse3), contentDescription = "Email Icon")
        }
    )
}