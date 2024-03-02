package com.tunahankaryagdi.finmoni.presentation.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.tunahankaryagdi.finmoni.R


@Composable
fun CustomFloatingActionButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {


    FloatingActionButton(
        modifier = modifier,
        onClick = onClick,
        containerColor = MaterialTheme.colorScheme.primary
    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = stringResource(id = R.string.add_payment))
    }

}