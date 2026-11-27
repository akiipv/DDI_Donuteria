package org.example.project

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import org.example.project.presentation.views.koin.donutViewModule
import org.example.project.presentation.views.navController
import org.example.project.presentation.views.theme.AppTheme
import org.koin.compose.KoinApplication

@Composable
expect fun menuPrincipal(navController: NavHostController)

@Composable
fun App() {
    // 1. Creamos los modulos Koin y el archivo principal de Koin (inicialmente estaran vacios)
    // 2. Creamos el navigation con sus partes (Las vistas aún estan vacias)
    // 3. Creamos el AppTheme con su estructura de archivos Color, Type y Shape
    // 4. Creamos el menuPrincipal como un expect y creamos en cada version (movil, escritorio) sus actuals elegidos en el Mockup
    // 5. Creamos la primera vista, su viewModel y su State.
    // 5.1 Añadimos esta vista-viewmodel-state dentro del navigation y koin
    // 6. Revisamos que la vista funcione y luego continuamos creando las demas vistas

    val navController = rememberNavController()

    KoinApplication(application = {
        modules(donutViewModule)
    }) {
        AppTheme(darkTheme = true) {
            menuPrincipal(navController)
        }
    }
}