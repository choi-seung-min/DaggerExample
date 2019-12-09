package com.example.dependencyinjectionexample.DI.module

import android.app.Activity
import android.content.Context
import com.example.dependencyinjectionexample.DI.ActivityContext
import com.example.dependencyinjectionexample.DI.PerActivity
import com.example.dependencyinjectionexample.Main.MainPresenter
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(val activity: Activity){

    @Provides
    fun providesActivity(): Activity{
        return  activity
    }

    @Provides
    @ActivityContext
    fun providesContext(): Context{
        return activity
    }

    @PerActivity
    @Provides
    fun provideMainPresenter(): MainPresenter{
        return MainPresenter()
    }
}