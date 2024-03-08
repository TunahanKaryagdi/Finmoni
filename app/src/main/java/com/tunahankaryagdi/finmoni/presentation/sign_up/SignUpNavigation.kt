package com.tunahankaryagdi.finmoni.presentation.sign_up

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.tunahankaryagdi.finmoni.presentation.add_payment.AddPaymentScreenRoute


const val signUpRoute = "signUp"

fun NavController.navigateToSignUp(navOptions: NavOptions? = null){
    this.navigate(signUpRoute,navOptions)
}

fun NavGraphBuilder.signUpScreen(){
    composable(signUpRoute){
        SignUpScreenRoute()
    }
}