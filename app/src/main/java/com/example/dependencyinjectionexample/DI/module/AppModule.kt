package com.example.dependencyinjectionexample.DI.module

import android.app.Application
import android.content.Context
import com.example.dependencyinjectionexample.DI.ApplicationContext
import dagger.Module
import dagger.Provides

@Module
class AppModule(val app: Application){

    @Provides
    fun provideApplication(): Application{
        return app
    }

    @Provides
    @ApplicationContext
    fun provideContext(): Context{
        return app
    }
}