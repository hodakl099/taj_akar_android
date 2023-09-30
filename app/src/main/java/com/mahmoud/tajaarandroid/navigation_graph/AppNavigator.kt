package com.mahmoud.tajaarandroid.navigation_graph

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.mahmoud.tajaarandroid.presentation.authentication.GetStartedScreen
import com.mahmoud.tajaarandroid.presentation.authentication.LoginScreen
import com.mahmoud.tajaarandroid.presentation.authentication.PaymentMethodScreen
import com.mahmoud.tajaarandroid.presentation.authentication.SignupScreen
import com.mahmoud.tajaarandroid.presentation.home.HomeScreen
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepOne
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepThree
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingStepTwo
import com.mahmoud.tajaarandroid.presentation.onboarding.OnBoardingViewModel
import com.mahmoud.tajaarandroid.presentation.splash.SplashScreen
import com.mahmoud.tajaarandroid.presentation.util.Route
import com.mahmoud.tajaarandroid.presentation.util.Route.AUTH_GRAPH
import com.mahmoud.tajaarandroid.presentation.util.Route.GET_STARTED
import com.mahmoud.tajaarandroid.presentation.util.Route.HOME
import com.mahmoud.tajaarandroid.presentation.util.Route.HOME_GRAPH
import com.mahmoud.tajaarandroid.presentation.util.Route.ONBOARDING_GRAPH
import com.mahmoud.tajaarandroid.presentation.util.Route.PAYMENT_METHOD
import com.mahmoud.tajaarandroid.presentation.util.Route.SPLASH

@Composable
fun AppNavigator(
    innerPadding : PaddingValues,
    onBoardingViewModel: OnBoardingViewModel
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = HOME_GRAPH) {
        navigation( route =ONBOARDING_GRAPH, startDestination = SPLASH ) {
                composable(
                    Route.SPLASH,
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
                        onNavigate = {
                            navController.navigate(Route.ONBOARDING_STEP_1) {
                                popUpTo(SPLASH) {
                                    inclusive = true
                                }
                            }
                        }
                    )
                }
                composable(
                    route = Route.ONBOARDING_STEP_1,
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
                            onBoardingViewModel.nextStep()
                            navController.navigate(Route.ONBOARDING_STEP_2)
                        },
                        viewModel = onBoardingViewModel
                    )
                }
                composable(
                    route = Route.ONBOARDING_STEP_2,
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
                        viewModel = onBoardingViewModel,
                        onNavigate = {
                            onBoardingViewModel.nextStep()
                            navController.navigate(Route.ONBOARDING_STEP_3)
                        }
                    )
                }
                composable(
                    route = Route.ONBOARDING_STEP_3,
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
                        viewModel = onBoardingViewModel,
                        onNavigate = {
                            navController.navigate(Route.GET_STARTED) {
                                popUpTo(Route.ONBOARDING_STEP_1) {
                                    inclusive = true
                                }
                            }
                        }
                    )
                }
        }

        navigation(startDestination = GET_STARTED,route = AUTH_GRAPH) {
            composable(
               route = GET_STARTED,
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
                GetStartedScreen(
                    onSignUp = {
                        navController.navigate(Route.SIGN_UP)
                    },
                    onLogin = {
                        navController.navigate(Route.LOGIN)
                    },

                )
            }
            composable(
                route = Route.SIGN_UP,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Up,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Down,
                        animationSpec = tween(500)
                    )
                }
            ) {
                SignupScreen()
            }
            composable(
               route = Route.LOGIN,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Up,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Down,
                        animationSpec = tween(500)
                    )
                }
            ) {
                LoginScreen(
                    onLogin = {
                        navController.navigate(PAYMENT_METHOD)
                    }
                )
            }
            composable(
                route = Route.PAYMENT_METHOD,
                enterTransition = {
                    slideIntoContainer(
                        AnimatedContentTransitionScope.SlideDirection.Up,
                        animationSpec = tween(500)
                    )
                },
                exitTransition = {
                    slideOutOfContainer(
                        AnimatedContentTransitionScope.SlideDirection.Down,
                        animationSpec = tween(500)
                    )
                }
            ) {
               PaymentMethodScreen(
                   onNextClick = {
                       navController.navigate(HOME) {
                           popUpTo(HOME){
                               inclusive = true
                           }
                       }
                   }
               )
            }
        }

        navigation(startDestination = HOME,route = HOME_GRAPH) {
            composable(HOME) {
                HomeScreen()
            }
        }
    }
}