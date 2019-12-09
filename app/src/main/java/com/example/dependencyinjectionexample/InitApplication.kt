package com.example.dependencyinjectionexample

import android.app.Application
import android.content.Context
import com.example.dependencyinjectionexample.DI.component.ApplicationComponent
import com.example.dependencyinjectionexample.DI.component.DaggerApplicationComponent
import com.example.dependencyinjectionexample.DI.module.AppModule

class InitApplication: Application(){


    companion object{
        fun get(context: Context): InitApplication{
            return context.applicationContext as InitApplication
        }
    }

    fun component(): ApplicationComponent{
        val appComponent = DaggerApplicationComponent.builder()
            .appModule(AppModule(this))
            .build()
        return appComponent
    }
}