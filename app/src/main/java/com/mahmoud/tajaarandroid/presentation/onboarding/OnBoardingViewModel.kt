package com.mahmoud.tajaarandroid.presentation.onboarding

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor() : ViewModel() {

    var currentStep by mutableIntStateOf(0)
        private set
    fun onStepChange(step : Int) {
        currentStep = step
    }

    fun nextStep() {
        currentStep += 1
    }
}