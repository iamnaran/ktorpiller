package com.delphiclab.ktorpiller.di

import com.delphiclab.ktorpiller.presentation.HomeViewModel
import com.delphiclab.ktorpiller.presentation.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainViewModel(get()) }
    viewModel { HomeViewModel() }

}


