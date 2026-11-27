package org.example.project

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.example.project.presentation.views.navController

@Composable
actual fun menuPrincipal(navController: NavHostController) {
    navController(navController)
}