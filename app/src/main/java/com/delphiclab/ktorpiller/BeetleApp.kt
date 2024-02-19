package com.delphiclab.ktorpiller

import android.app.Application
import com.delphiclab.ktorpiller.di.appDiComponents
import com.delphiclab.ktorpiller.utils.AppLog
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BeetleApp : Application() {

    override fun onCreate() {
        super.onCreate()
        AppLog.init()
        configureAppDI()
    }

    private fun configureAppDI() {
        startKoin {
            androidLogger()
            androidContext(this@BeetleApp)
            modules(provideComponents())
        }
    }

    private fun provideComponents() = appDiComponents

}