package com.panku.kotlintest

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.panku.KotlinActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Date：2017/6/5
 * Time: 14:17
 * author: huangyanan
 */

class KotlinTest : AppCompatActivity(), View.OnClickListener {
//    private var btn: Button? = null
//    private var et: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        btn = findViewById(R.id.btn) as Button
//        et = findViewById(R.id.et) as EditText
        btn.setOnClickListener(this)
//        btn!!.text = "Kotlin Test";
    }

    override fun onClick(v: View) {
        val id = v.id
//        if (id == R.id.btn) {
//            Toast.makeText(this, et!!.text.toString(), Toast.LENGTH_LONG).show()
//            startActivity(Intent(this, KotlinActivity::class.java))
//        }
        when (id) {
            R.id.btn -> click()
        }
    }

    private fun click() {
        Toast.makeText(this, et.text.toString(), Toast.LENGTH_LONG).show()
        startActivity(Intent(this, KotlinActivity::class.java))
    }

    fun init() {
        startActivity(Intent(this, KotlinActivity::class.java))

        val intent = Intent()
        intent.setClass(this, KotlinActivity::class.java)
        intent.putExtra("Kotlin", "Kotlin")
        startActivity(intent)
    }
}
