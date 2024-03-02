package com.tunahankaryagdi.finmoni.presentation.components

import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit
) {

    TextField(
        modifier = modifier,
        value = value,
        onValueChange = onValueChange,
        colors = TextFieldDefaults.colors(

        )
    )
}