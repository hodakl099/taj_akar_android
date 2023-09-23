package com.mahmoud.tajaarandroid.presentation.verification.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VerificationInputFiled(
    modifier: Modifier = Modifier,
    focusRequesters :  List<FocusRequester>,
    textFields : SnapshotStateList<String>,

) {

   //TODO() move this state to a viewModel.
    var isFocused by remember {
        mutableStateOf(false)
    }
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp), // Adjust the spacing between TextFields as needed
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        textFields.forEachIndexed { index, text ->
            Box (
                modifier = Modifier
                    .size(67.dp)
                    .clip(RoundedCornerShape(14.dp))
                    .background(Color.Gray.copy(alpha = 0.1f))
            ){
                BasicTextField(
                    value = text,
                    onValueChange = {
                        if (it.length <= 1) {
                            textFields[index] = it
                            if (it.isNotEmpty() && index < 3) focusRequesters[index + 1].requestFocus()
                        }
                    },
                    keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
                    textStyle = TextStyle(
                        textAlign = TextAlign.Center,
                        fontSize = 20.sp,
                        color = Color.Black
                    ),
                    modifier = Modifier
                        .align(Alignment.Center)
                        .focusRequester(focusRequesters[index])
                        .onFocusChanged { state ->
                            isFocused = state.isFocused
                        }
                )
            }
            LaunchedEffect(isFocused) {
                if (isFocused && textFields[index].isNotEmpty() && index < 3) {
                    focusRequesters[index + 1].requestFocus()
                }
            }
        }
    }

}