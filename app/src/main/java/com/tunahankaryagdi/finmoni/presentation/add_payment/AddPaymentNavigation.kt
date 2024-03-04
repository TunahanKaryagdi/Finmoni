package com.tunahankaryagdi.finmoni.presentation.add_payment

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable


const val addPaymentRoute = "addPayment"

fun NavController.navigateToAddPayment(navOptions: NavOptions? = null){
    this.navigate(addPaymentRoute,navOptions)
}

fun NavGraphBuilder.addPaymentScreen(){
    composable(addPaymentRoute){
        AddPaymentScreenRoute()
    }
}