package com.tunahankaryagdi.finmoni.presentation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.tunahankaryagdi.finmoni.R
import com.tunahankaryagdi.finmoni.presentation.overview.overviewRoute
import com.tunahankaryagdi.finmoni.presentation.payments.paymentsRoute


enum class TopLevelDestination(
    val iconId: Int,
    val textId: Int,
    val route: String,
){
    OVERVIEW(
        iconId = R.drawable.ic_launcher_foreground,
        textId = R.string.overview,
        route = overviewRoute
    ),

    PAYMENTS(
        iconId = R.drawable.ic_launcher_foreground,
        textId = R.string.payments,
        route = paymentsRoute
    )
}