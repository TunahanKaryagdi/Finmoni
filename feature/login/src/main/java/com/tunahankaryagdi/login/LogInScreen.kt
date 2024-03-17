package com.tunahankaryagdi.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.tunahankaryagdi.designsystem.components.FinmoniButton
import com.tunahankaryagdi.designsystem.components.FinmoniTextField
import com.tunahankaryagdi.designsystem.dimen.Padding


@Composable
fun LogInScreenRoute(
    modifier: Modifier = Modifier
) {

    LogInScreen()

}


@Composable
fun LogInScreen(
    modifier: Modifier = Modifier
) {

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(Padding.medium),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(Padding.medium),
    ){

        item{
            Text(
                modifier = Modifier
                    .padding(top = Padding.large),
                text = stringResource(id = R.string.log_in),
                style = MaterialTheme.typography.headlineMedium
            )
        }

        item {
            FinmoniTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = "",
                onValueChange = {},
                placeholder = stringResource(id = R.string.email)
            )
        }

        item {
            FinmoniTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = "",
                onValueChange = {},
                placeholder = stringResource(id = R.string.password)
            )
        }
        
        item { 
            FinmoniButton(
                modifier = Modifier.fillMaxWidth(),
                onClick = {  },
                text = stringResource(id = R.string.log_in)
            )
        }
    }

}

