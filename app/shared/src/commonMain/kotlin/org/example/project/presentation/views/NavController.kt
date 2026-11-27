package org.example.project.presentation.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import org.example.project.presentation.views.HomeDonuteria

@Composable
fun navController(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "HomeDonuteria"
    ) {
        // Destino 1: Inicio (Flujo en Pila hacia Detalle)
        composable("HomeDonuteria") {
            HomeDonuteria()
        }

        // Destino 1: Inicio (Flujo en Pila hacia Detalle)
        composable("FormularioDonuteria") {
            FormularioDonuteria(terminarForm = {
                navController.navigate("HomeDonuteria")
            })
        }
    }
}