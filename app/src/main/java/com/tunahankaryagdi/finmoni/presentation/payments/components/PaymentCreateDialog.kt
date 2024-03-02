package com.tunahankaryagdi.finmoni.presentation.payments.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.tunahankaryagdi.finmoni.R
import com.tunahankaryagdi.finmoni.presentation.components.CustomTextField

@Composable
fun PaymentCreateDialog(
    modifier: Modifier = Modifier
) {

    AlertDialog(
        modifier = modifier,
        onDismissRequest = {  },
        confirmButton = {
            Text(text = stringResource(id = R.string.done))
        },
        dismissButton = {
            Text(
                text = stringResource(id = R.string.cancel),
                color = Color.Red
            )
        },
        title = {
            Text(text = stringResource(id = R.string.create_payment))
        },
        text = {

            Column {
                CustomTextField(value = "", onValueChange = {})
                CustomTextField(value = "", onValueChange = {})
            }
        },
        titleContentColor = MaterialTheme.colorScheme.primary
    )
}