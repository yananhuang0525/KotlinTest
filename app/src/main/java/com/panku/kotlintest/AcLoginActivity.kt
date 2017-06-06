package com.panku.kotlintest

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.ac_login.*

class AcLoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View) {
        val id = v.id
        when (id) {
            R.id.btn_login -> login();
        }
    }

    private fun login() {
        if (et_name.text.length != 0 && et_pass.text.length != 0) {
            if (et_pass.text.toString().equals("123123")) {
                startActivity(Intent(this, KotlinTest::class.java))
            } else {
                Toast.makeText(this, "密码错误", Toast.LENGTH_LONG).show()
            }
        } else {
            Toast.makeText(this, "请输入用户名密码", Toast.LENGTH_LONG).show()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ac_login)
        btn_login.setOnClickListener(this)
    }
}
