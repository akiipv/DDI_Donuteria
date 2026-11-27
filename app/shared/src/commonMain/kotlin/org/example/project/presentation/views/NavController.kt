package org.example.project.presentation.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun navController(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "homeDonut"
    ) {
        // Destino 1: Inicio (Flujo en Pila hacia Detalle)
        composable("homeDonut") {
            // llamada a la vista
            Text(text = "Ruta1")
        }

        // Destino 1: Inicio (Flujo en Pila hacia Detalle)
        composable("ruta1") {
            // llamada a la vista
            homeDonuteria()
        }
    }
}