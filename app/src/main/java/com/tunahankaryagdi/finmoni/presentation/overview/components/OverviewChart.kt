package com.tunahankaryagdi.finmoni.presentation.overview.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.hd.charts.LineChartView
import com.hd.charts.common.model.ChartDataSet
import com.hd.charts.style.ChartViewStyle
import com.hd.charts.style.LineChartDefaults
import com.tunahankaryagdi.finmoni.R


@Composable
fun OverviewChart(
    modifier: Modifier = Modifier
) {
    val dataSet = ChartDataSet(
        items = listOf(10f, 100f, 20f, 50f, 150f, 70f, 10f, 20f, 40f),
        title = ""
    )
    val style = LineChartDefaults.style(
        bezier = false,
        pointColor = MaterialTheme.colorScheme.secondary,
        lineColor = MaterialTheme.colorScheme.primary,

    )

    LineChartView(
        dataSet = dataSet,
        style = style
    )
}