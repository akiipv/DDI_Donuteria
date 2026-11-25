package org.example.project

import androidx.compose.runtime.Composable
import com.ejemplo.project.presentation.PantallaConBottomBarReal
import com.ejemplo.project.presentation.PantallaConDrawerFijoReal
import com.ejemplo.project.presentation.PantallaConDrawerModalReal

@Composable
actual fun PrincipalMenu() {
    PantallaConDrawerModalReal()
}