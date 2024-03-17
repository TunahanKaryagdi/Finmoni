package com.tunahankaryagdi.finmoni.navigation


import com.tunahankaryagdi.finmoni.R

import com.tunahankaryagdi.overview.OVERVIEW_ROUTE
import com.tunahankaryagdi.payments.PAYMENTS_ROUTE


enum class TopLevelDestination(
    val iconId: Int,
    val textId: Int,
    val route: String,
){
    OVERVIEW(
        iconId = R.drawable.ic_launcher_foreground,
        textId = R.string.overview,
        route = OVERVIEW_ROUTE
    ),

    PAYMENTS(
        iconId = R.drawable.ic_launcher_foreground,
        textId = R.string.payments,
        route = PAYMENTS_ROUTE
    )
}