package com.tunahankaryagdi.add_payment

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val ADD_PAYMENT_ROUTE = "addPayment"

fun NavController.navigateToAddPayment(navOptions: NavOptions? = null){
    this.navigate(ADD_PAYMENT_ROUTE,navOptions)
}

fun NavGraphBuilder.addPaymentScreen(){
    composable(ADD_PAYMENT_ROUTE){
        AddPaymentScreenRoute()
    }
}