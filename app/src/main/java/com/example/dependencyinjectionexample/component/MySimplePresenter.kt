package com.example.dependencyinjectionexample.component

class MySimplePresenter (private val repo: HelloRepository){
    fun sayHello() = repo.giveHello()
}