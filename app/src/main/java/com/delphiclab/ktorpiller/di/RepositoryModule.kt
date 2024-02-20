package com.delphiclab.ktorpiller.di

import com.delphiclab.ktorpiller.data.repo.AuthRepository
import com.delphiclab.ktorpiller.data.repo.AuthRepositoryImpl
import com.iamnaran.beetle.presentation.data.repo.HomeRepository
import com.iamnaran.beetle.presentation.data.repo.HomeRepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {
    single<HomeRepository> { HomeRepositoryImpl(get()) }
    single<AuthRepository> { AuthRepositoryImpl(get()) }
}