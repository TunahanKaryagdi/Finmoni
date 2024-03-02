package com.tunahankaryagdi.finmoni.presentation.payments

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val paymentsRoute = "payment"

fun NavController.navigateToPayments(navOptions: NavOptions? = null){
    this.navigate(paymentsRoute,navOptions)
}

fun NavGraphBuilder.paymentsScreen(){
    composable(paymentsRoute){
        PaymentsScreenRoute()
    }
}