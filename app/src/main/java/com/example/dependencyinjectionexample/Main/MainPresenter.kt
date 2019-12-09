package com.example.dependencyinjectionexample.Main

class MainPresenter() {

    lateinit var mainView: MainView

    fun setView(mainView: MainView){
        this.mainView = mainView
    }

    fun showData(){
        mainView.showLoading()
        mainView.showMessage("Dagger2")
        mainView.hideLoading()
    }
}