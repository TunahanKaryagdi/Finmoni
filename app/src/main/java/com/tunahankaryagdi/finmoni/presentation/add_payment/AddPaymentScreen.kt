package com.tunahankaryagdi.finmoni.presentation.add_payment

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.tunahankaryagdi.finmoni.R
import com.tunahankaryagdi.finmoni.presentation.components.CustomButton
import com.tunahankaryagdi.finmoni.presentation.components.CustomDatePicker
import com.tunahankaryagdi.finmoni.presentation.components.CustomTextField
import com.tunahankaryagdi.finmoni.presentation.components.CustomTopAppBar
import com.tunahankaryagdi.finmoni.presentation.consts.Padding
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


@Composable
fun AddPaymentScreenRoute(
    modifier: Modifier = Modifier
) {
    AddPaymentScreen(modifier = modifier)
}

@Composable
fun AddPaymentScreen(
    modifier: Modifier = Modifier
) {

    Scaffold (
        modifier = modifier,
        topBar = {
            CustomTopAppBar(
                title = {
                    Text(text = stringResource(id = R.string.create_payment))
                }
            )
        },
    ){
        AddPaymentScreenContent(modifier = Modifier.padding(it))
    }

}


@Composable
fun AddPaymentScreenContent(
    modifier: Modifier = Modifier
) {



    var selectedDate by remember{ mutableStateOf<Date?>(null)}
    var isOpen by remember{ mutableStateOf(false) }

    if (isOpen){
        CustomDatePicker(
            onDateSelected = { selectedDate = it },
            onDismiss = {isOpen = false}
        )
    }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(Padding.medium),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(Padding.small)
    ) {

        val textFieldModifier = Modifier.fillMaxWidth()
        CustomTextField(
            modifier = textFieldModifier,
            value = "",
            placeholder = stringResource(id = R.string.title),
            onValueChange = {}
        )
        CustomTextField(
            modifier = textFieldModifier,
            value = "",
            placeholder = stringResource(id = R.string.price),
            onValueChange = {}
        )
        CustomTextField(
            modifier = textFieldModifier,
            placeholder = stringResource(id = R.string.date_format),
            value = selectedDate?.let { dateFormatter(it) } ?: "",
            trailingIcon = {
                 Icon(
                     modifier = Modifier
                         .clickable {
                             isOpen = true
                         },
                     imageVector = Icons.Outlined.DateRange,
                     contentDescription = stringResource(id = R.string.date))
            },
            onValueChange = {},
            readOnly = true
        )
        CustomButton(
            modifier = Modifier.fillMaxWidth(),
            onClick = { isOpen = true },
            text = stringResource(id = R.string.save)
        )
    }
}


private fun dateFormatter(date: Date) : String{
    val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return dateFormat.format(date)
}