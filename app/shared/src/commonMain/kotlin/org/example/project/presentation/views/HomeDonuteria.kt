package org.example.project.presentation.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.draw.innerShadow
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.key.Key.Companion.R
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import org.example.project.generated.resources.Res
import org.example.project.generated.resources.donut_normal
import org.example.project.generated.resources.donut_rosa
import org.example.project.presentation.viewModels.*
import org.jetbrains.compose.resources.painterResource
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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "El círculo perfecto donde empieza tu mejor momento.",
                    style = MaterialTheme.typography.displayLarge,
                    fontWeight = FontWeight.Black,
                    textAlign = TextAlign.Start,
                    // fontStyle = , TODO
                    modifier = Modifier
                        .padding(top = 10.dp, start = 10.dp)
                        .weight(1f)
                )
                val sombraDonut = MaterialTheme.colorScheme.secondaryContainer.copy(alpha = 0.6f)
                Box(
                    modifier = Modifier
                        .weight(1f),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(Res.drawable.donut_rosa),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier
                            .fillMaxWidth()
                            .offset(x = 0.dp, y = 4.dp)
                            .dropShadow(
                                shape = CircleShape,
                                block = {
                                    radius = 16.dp.toPx()
                                    color = sombraDonut
                                    offset = Offset(x = 0f, y = 29f)
                                    spread = -45.dp.toPx()
                                }
                            )
                    )

                    Image(
                        painter = painterResource(Res.drawable.donut_rosa),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

            }
        }
    }

}