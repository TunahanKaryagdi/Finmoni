package com.tunahankaryagdi.finmoni.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp


@Composable
fun SpacerVertical(size: Dp) {
    Spacer(modifier = Modifier.height(size))
}


@Composable
fun SpacerHorizontal(size: Dp) {
    Spacer(modifier = Modifier.width(size))
}

