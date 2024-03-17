package com.tunahankaryagdi.signup

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val SIGN_UP_ROUTE = "signUp"

fun NavController.navigateToSignUp(navOptions: NavOptions? = null){
    this.navigate(SIGN_UP_ROUTE,navOptions)
}

fun NavGraphBuilder.signUpScreen(){
    composable(SIGN_UP_ROUTE){
        SignUpScreenRoute()
    }
}