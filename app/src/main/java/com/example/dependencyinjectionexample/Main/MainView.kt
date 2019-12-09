package com.example.dependencyinjectionexample.Main

interface MainView {

    fun showLoading()

    fun showMessage(message: String)

    fun hideLoading()
}