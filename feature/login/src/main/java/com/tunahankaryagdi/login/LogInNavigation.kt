package com.tunahankaryagdi.login

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val LOG_IN_ROUTE = "logIn"

fun NavController.navigateToLogIn(navOptions: NavOptions? = null){
    this.navigate(LOG_IN_ROUTE,navOptions)
}

fun NavGraphBuilder.logInScreen(){
    composable(LOG_IN_ROUTE){
        LogInScreenRoute()
    }
}