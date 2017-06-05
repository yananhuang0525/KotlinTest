package com.panku

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.panku.kotlintest.R
import kotlinx.android.synthetic.main.ac_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_kotlin)
//        var tv = findViewById(R.id.tv) as TextView
//        var btn = findViewById(R.id.btn) as Button
//        var et = findViewById(R.id.et) as EditText
//        btn!!.setOnClickListener { Toast.makeText(this, et.text.toString(), Toast.LENGTH_LONG).show() }
//        tv.text = "第二个Kotlin";

        tv.text = "第二个Kotlin"
        btn.setOnClickListener { Toast.makeText(this, et.text.toString(), Toast.LENGTH_LONG).show() }
    }
}
