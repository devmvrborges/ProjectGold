package com.mvrborges.projectgold.configs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.mvrborges.projectgold.R

class CreateNewAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.createLogin_title)
        setContentView(R.layout.activity_create_new_account)
    }

    fun onClickBtnCancel(view: View) {
        val inCreate = Intent(this@CreateNewAccount, Login::class.java)
        startActivity(inCreate)
    }

    fun onClickBtnCreate(view: View) {
        val inCreate = Intent(this@CreateNewAccount, Login::class.java)
        startActivity(inCreate)
    }
}
