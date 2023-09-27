package com.mahmoud.tajaarandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mahmoud.tajaarandroid.presentation.filter.FilterSettingsScreen
import com.mahmoud.tajaarandroid.presentation.filter.FilteredScreen
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepOne
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepThree
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepTwo
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingViewModel
import com.mahmoud.tajaarandroid.presentation.splash.SplashScreen
import com.mahmoud.tajaarandroid.presentation.util.Route.GET_STARTED
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_1
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_2
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_STEP_3
import com.mahmoud.tajaarandroid.presentation.util.Route.SPLASH
import com.mahmoud.tajaarandroid.ui.theme.TajAarAndroidTheme
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class, ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel = hiltViewModel<OnBoardingViewModel>()
            val navController = rememberNavController()
            TajAarAndroidTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    NavHost(navController = navController, startDestination = GET_STARTED ) {
                        composable(
                            SPLASH,
                            enterTransition = {
                                slideIntoContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Left,
                                    animationSpec = tween(700)
                                )
                            },
                            exitTransition = {
                                slideOutOfContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Right,
                                    animationSpec = tween(700)
                                )
                            }
                        ) {
                            SplashScreen(
                                modifier = Modifier.padding(innerPadding),
                                onNavigate =  {
                                    navController.navigate(ONBOARDING_STEP_1) {
                                        popUpTo(SPLASH) {
                                            inclusive = true
                                        }
                                    }
                                }
                            )
                        }
                        composable(
                            route = ONBOARDING_STEP_1,
                            enterTransition = {
                                slideIntoContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Left,
                                    animationSpec = tween(700)
                                )
                            },
                            exitTransition = {
                                slideOutOfContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Right,
                                    animationSpec = tween(700)
                                )
                            }
                        ) {
                                OnBoardingStepOne(
                                    onNavigate = {
                                        viewModel.nextStep()
                                        navController.navigate(ONBOARDING_STEP_2)
                                    },
                                    viewModel = viewModel
                                )
                        }
                        composable(
                          route = ONBOARDING_STEP_2,
                            enterTransition = {
                                slideIntoContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Left,
                                    animationSpec = tween(700)
                                )
                            },
                            exitTransition = {
                                slideOutOfContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Right,
                                    animationSpec = tween(700)
                                )
                            }
                        ) {
                            OnBoardingStepTwo(
                                viewModel = viewModel,
                                onNavigate = {
                                    viewModel.nextStep()
                                    navController.navigate(ONBOARDING_STEP_3)
                                }
                            )
                        }
                        composable(
                            route = ONBOARDING_STEP_3,
                            enterTransition = {
                                slideIntoContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Left,
                                    animationSpec = tween(500)
                                )
                            },
                            exitTransition = {
                                slideOutOfContainer(
                                    AnimatedContentTransitionScope.SlideDirection.Right,
                                    animationSpec = tween(500)
                                )
                            }
                        ) {
                            OnBoardingStepThree(
                                viewModel = viewModel,
                                onNavigate = {}
                            )
                        }
                        composable(
                            route = GET_STARTED,
                        ) {
                            FilteredScreen()
                        }
                    }

                }
            }
        }
    }
}

