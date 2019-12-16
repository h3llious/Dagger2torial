package com.eastagile.dagger2torial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

//    @Inject
//    @field:Named(INFO1)
//    lateinit var info1: Info

    @Inject
//    @field:Named(INFO2)
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        DaggerInfoComponent.create().inject(this)

        hello_text.text = info.text
    }
}
