package com.yandexpracticum.di_example_sprint_17

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class BucketActivity : AppCompatActivity() {

    private lateinit var nameViewModel: NameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bucket)

        val nameTextView = findViewById<TextView>(R.id.nameTextView)

        nameViewModel = (applicationContext as MyApp).nameViewModel

        nameTextView.addTextChangedListener {
            nameViewModel.name = it.toString()
        }

    }
}

class MyApp : Application() {
    val nameViewModel = NameViewModel()
}

class NameViewModel(){
    var name = ""
}





