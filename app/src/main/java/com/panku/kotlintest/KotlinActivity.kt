package com.panku.kotlintest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_kotlin)
        var tv = findViewById(R.id.tv) as TextView
        var btn = findViewById(R.id.btn) as Button
        var et = findViewById(R.id.et) as EditText
        btn!!.setOnClickListener { Toast.makeText(this, et.text.toString(), Toast.LENGTH_LONG).show() }
        tv.text = "第二个Kotlin";
    }
}
