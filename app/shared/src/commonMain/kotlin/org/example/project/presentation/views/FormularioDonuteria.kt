package org.example.project.presentation.views

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import org.example.project.presentation.viewModels.DonutViewModel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun FormularioDonuteria(
    viewModel: DonutViewModel = koinViewModel(),
    terminarForm: () -> Unit
) {
    Button(onClick = terminarForm) {
        Text(text = "Realizar pedido")
    }
}