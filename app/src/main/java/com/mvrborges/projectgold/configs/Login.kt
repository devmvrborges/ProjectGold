package com.mvrborges.projectgold.configs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.mvrborges.projectgold.R

class Login : AppCompatActivity() {


    //    final Button btnForget = findViewById(R.id.btnForget);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.login_title)
        setContentView(R.layout.activity_login)

        val btnCreate = findViewById<View>(R.id.btnCreate) as Button
        val btnForget = findViewById<View>(R.id.btnForget) as Button

    }

    fun onClickBtnSign(view: View) {
        val inCreate = Intent(this@Login, CreateNewAccount::class.java)
        startActivity(inCreate)
    }

    fun onClickBtnForget(view: View) {
        val inCreate = Intent(this@Login, ForgetPassword::class.java)
        startActivity(inCreate)
    }
}
