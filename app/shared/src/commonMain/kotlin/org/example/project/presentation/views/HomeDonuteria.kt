package org.example.project.presentation.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import org.example.project.presentation.viewModels.*
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeDonuteria(
    viewModel: DonutViewModel = koinViewModel()
) {
    val state = viewModel.uiState.collectAsState().value

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background),
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                //  .background(color = MaterialTheme.colorScheme.background)
                ,
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("topbar")
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = MaterialTheme.colorScheme.primaryContainer)
                .background(
                    brush = Brush.verticalGradient(
                        0.0f to MaterialTheme.colorScheme.secondaryContainer,
                        1.0f to MaterialTheme.colorScheme.secondaryContainer,
                        1.0f to Color.Transparent,
                        startY = 0f,
                        endY = 5f
                    )
                )
                .background(
                    brush = Brush.verticalGradient(
                        0.00f to Color.Transparent,
                        0.45f to Color.Transparent,
                        0.65f to MaterialTheme.colorScheme.background,
                        1.0f to MaterialTheme.colorScheme.background,
                        startY = 5f
                    )
                )
                .padding(innerPadding)
        ) {

        }
    }

}