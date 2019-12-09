package com.example.dependencyinjectionexample.DI.component

import com.example.dependencyinjectionexample.DI.PerActivity
import com.example.dependencyinjectionexample.DI.module.ActivityModule
import com.example.dependencyinjectionexample.Main.MainActivity
import dagger.Component

@PerActivity
@Component(modules = [ActivityModule::class], dependencies = arrayOf(ApplicationComponent::class))
interface ActivityComponent {
    fun inject(mainActivity: MainActivity)
}
