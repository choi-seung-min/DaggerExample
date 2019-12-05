package com.example.dependencyinjectionexample.component

class HelloRepositorylmpl : HelloRepository {
    override fun giveHello() = "Hello Koin"
}