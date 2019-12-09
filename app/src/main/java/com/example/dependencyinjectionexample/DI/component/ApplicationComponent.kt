package com.example.dependencyinjectionexample.DI.component

import android.content.Context
import com.example.dependencyinjectionexample.DI.ApplicationContext
import com.example.dependencyinjectionexample.DI.module.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface ApplicationComponent{
    @ApplicationContext
    fun context(): Context
}