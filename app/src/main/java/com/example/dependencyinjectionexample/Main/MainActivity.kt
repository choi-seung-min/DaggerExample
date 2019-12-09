package com.example.dependencyinjectionexample.Main

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.dependencyinjectionexample.DI.component.DaggerActivityComponent
import com.example.dependencyinjectionexample.DI.module.ActivityModule
import com.example.dependencyinjectionexample.InitApplication
import com.example.dependencyinjectionexample.R
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityComponent = DaggerActivityComponent.builder()
            .applicationComponent(InitApplication.get(this).component())
            .activityModule(ActivityModule(this))
            .build()
        activityComponent.inject(this)
        mainPresenter.setView(this)
        mainPresenter.showData()
    }

    override fun showLoading() {

    }

    override fun showMessage(message: String) {
        toast(message)
        text.text = "Hey $message"
    }

    override fun hideLoading() {

    }

    fun Context.toast(message: CharSequence, duration: Int = Toast.LENGTH_LONG){
        Toast.makeText(this, message, duration).show()
    }
}
