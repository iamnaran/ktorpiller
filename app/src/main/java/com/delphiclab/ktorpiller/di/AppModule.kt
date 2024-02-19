package com.delphiclab.ktorpiller.di

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import org.koin.dsl.module

object AppModule {

    val coroutineModule = module {
        single { Dispatchers.Default }
        single { CoroutineScope(Dispatchers.Main + Job()) }
    }
}
