package com.tunahankaryagdi.designsystem.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FinmoniTopAppBar(
    modifier: Modifier = Modifier,
    title: @Composable ()-> Unit = {},
    actions: @Composable RowScope.() -> Unit = {}
) {

    TopAppBar(
        modifier = modifier,
        title = title,
        actions = actions,
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent,
            titleContentColor = MaterialTheme.colorScheme.primary
        )
    )


}