package org.example.project.presentation.views.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val AppShapes = Shapes(
    extraSmall = RoundedCornerShape(4.dp),   // TextFields, DropdownMenu, Snackbar
    small = RoundedCornerShape(8.dp),        // Chips, botones compactos
    medium = RoundedCornerShape(12.dp),      // Cards de elementos, contenedores
    large = RoundedCornerShape(16.dp),       // FAB, NavigationDrawer
    extraLarge = RoundedCornerShape(28.dp)   // AlertDialog, ModalBottomSheet
)