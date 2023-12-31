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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    placeHolderText : String,
    resourceId : Int,
    isPassword : Boolean = false
) {
    OutlinedTextField(
        modifier = modifier
            .width(327.dp)
            .height(59.dp)
            .background(MaterialTheme.colorScheme.background, RoundedCornerShape(14.dp))
            .fillMaxHeight()
            .wrapContentHeight(Alignment.CenterVertically),
        value = value,
        onValueChange = onValueChange,
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        maxLines = 1,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Transparent,
            unfocusedBorderColor = Color.Transparent
        ),
        singleLine = true,
        leadingIcon = {
            Icon(
                modifier = Modifier.padding(start = 16.dp),
                painter = painterResource(
                    id = resourceId
                ),
                contentDescription = placeHolderText,
                tint = MaterialTheme.colorScheme.onPrimary
            )
        },
        placeholder = {
            Text(
                text = placeHolderText,
                color = Color.Black.copy(0.4f)
            )
        },
        trailingIcon = {
            if(isPassword)
            Text(
                modifier = Modifier.padding(
                    end = 24.dp,
                    start = 16.dp
                ),
                text = "Forgot?",
                fontWeight = FontWeight.Bold,
                fontSize = 10.sp,
                color = Color.Red
            )
        },
    )
}

