package com.mahmoud.tajaarandroid.presentation.util

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp


object ScreenWidth {
    @Composable
    fun screenWidthDp() : Int  {
        val configuration = LocalConfiguration.current
        return configuration.screenWidthDp
    }
    @Composable
    fun screenWidthFloat() : Float {
       return screenWidthDp().dp.value
    }
}