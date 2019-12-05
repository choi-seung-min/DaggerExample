package com.example.dependencyinjectionexample.di

import com.example.dependencyinjectionexample.component.HelloRepository
import com.example.dependencyinjectionexample.component.HelloRepositorylmpl
import com.example.dependencyinjectionexample.component.MySimplePresenter
import org.koin.dsl.module

val appModule = module {
    single<HelloRepository> { HelloRepositorylmpl() }
    factory { MySimplePresenter(get()) }
}