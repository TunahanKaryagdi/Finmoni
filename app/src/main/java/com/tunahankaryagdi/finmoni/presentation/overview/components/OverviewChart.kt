package com.tunahankaryagdi.finmoni.presentation.overview.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.hd.charts.LineChartView
import com.hd.charts.common.model.ChartDataSet
import com.hd.charts.style.ChartViewStyle
import com.hd.charts.style.LineChartDefaults
import com.tunahankaryagdi.finmoni.R


@Composable
fun OverviewChart(
    modifier: Modifier = Modifier
) {

    val size = LocalConfiguration.current

    val dataSet = ChartDataSet(
        items = listOf(10f, 100f, 20f, 50f, 150f, 70f, 10f, 20f, 40f),
        title = ""
    )
    val style = LineChartDefaults.style(
        bezier = false,
        pointColor = MaterialTheme.colorScheme.secondary,
        lineColor = MaterialTheme.colorScheme.primary,
    )

    Box(
        modifier = modifier
            .height((size.screenHeightDp * 0.4).dp)
    ){
        LineChartView(
            dataSet = dataSet,
            style = style
        )
    }

}