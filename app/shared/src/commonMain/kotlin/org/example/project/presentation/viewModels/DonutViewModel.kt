package org.example.project.presentation.viewModels

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import org.example.project.presentation.states.DonutUIState

class DonutViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(DonutUIState())
    val uiState: StateFlow<DonutUIState> = _uiState.asStateFlow()
}