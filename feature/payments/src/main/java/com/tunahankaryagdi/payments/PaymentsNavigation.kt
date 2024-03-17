package com.tunahankaryagdi.payments

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val PAYMENTS_ROUTE = "payments"

fun NavController.navigateToPayments(navOptions: NavOptions? = null){
    this.navigate(PAYMENTS_ROUTE,navOptions)
}

fun NavGraphBuilder.paymentsScreen(){
    composable(PAYMENTS_ROUTE){
        PaymentsScreenRoute()
    }
}