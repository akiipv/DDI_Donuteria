package org.example.project.presentation.views.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import org.example.project.generated.resources.Questrial_Regular
import org.example.project.generated.resources.Quicksand_Bold
import org.example.project.generated.resources.Quicksand_Medium
import org.example.project.generated.resources.Quicksand_Regular
import org.jetbrains.compose.resources.Font
import org.example.project.generated.resources.Res
import org.example.project.generated.resources.ZalandoSansSemiExpanded_VariableFont_wght

@Composable
fun AppTypography(): Typography {
    val bodyFontFamily = FontFamily(
        Font(Res.font.Questrial_Regular)
    )

    val displayFontFamily = FontFamily(
        Font(Res.font.Quicksand_Regular),
        Font(Res.font.Quicksand_Medium, FontWeight.Medium),
        Font(Res.font.Quicksand_Bold, FontWeight.Bold)
    )

    val displayLarge = FontFamily(
        Font(Res.font.ZalandoSansSemiExpanded_VariableFont_wght)
    )

    val baseline = Typography()
    return Typography(
        displayLarge = baseline.displayLarge.copy(fontFamily = displayLarge),
        displayMedium = baseline.displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = baseline.displaySmall.copy(fontFamily = displayFontFamily),

        headlineLarge = baseline.headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = baseline.headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = baseline.headlineSmall.copy(fontFamily = displayFontFamily),

        titleLarge = baseline.titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = baseline.titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = baseline.titleSmall.copy(fontFamily = displayFontFamily),

        bodyLarge = baseline.bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = baseline.bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = baseline.bodySmall.copy(fontFamily = bodyFontFamily),

        labelLarge = baseline.labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = baseline.labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = baseline.labelSmall.copy(fontFamily = bodyFontFamily)
    )
}