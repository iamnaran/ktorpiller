package com.delphiclab.ktorpiller.di

val appDiComponents = listOf(
    AppModule.coroutineModule,
    NetworkModule.httpModule,
    NetworkModule.apiServiceModule,
    repositoryModule,
    viewModelModule,

    )