package org.example.project.presentation.views.koin

import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module
import org.example.project.presentation.viewModels.*

val donutViewModule = module {
   viewModelOf(::DonutViewModel)
}