package com.mvrborges.projectgold.configs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.mvrborges.projectgold.R

class ForgetPassword : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.forgetPassword_title)
        setContentView(R.layout.activity_forget_password)


    }

    fun onClickBtnCancel(view: View) {
        val inCreate = Intent(this@ForgetPassword, Login::class.java)
        startActivity(inCreate)
    }

    fun onClickBtnCreate(view: View) {
        val inCreate = Intent(this@ForgetPassword, Login::class.java)
        startActivity(inCreate)
    }
}
