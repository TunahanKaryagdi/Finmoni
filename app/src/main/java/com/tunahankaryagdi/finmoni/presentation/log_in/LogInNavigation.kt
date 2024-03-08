package com.tunahankaryagdi.finmoni.presentation.log_in

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.tunahankaryagdi.finmoni.presentation.add_payment.AddPaymentScreenRoute


const val logInRoute = "logIn"

fun NavController.navigateToLogIn(navOptions: NavOptions? = null){
    this.navigate(logInRoute,navOptions)
}

fun NavGraphBuilder.logInScreen(){
    composable(logInRoute){
        LogInScreenRoute()
    }
}