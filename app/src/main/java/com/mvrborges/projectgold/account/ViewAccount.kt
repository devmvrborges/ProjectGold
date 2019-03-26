package com.mvrborges.projectgold.account

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View

import com.mvrborges.projectgold.R
import com.mvrborges.projectgold.income.AddIncome

class ViewAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.account_title_view)
        setContentView(R.layout.activity_view_account)

        val fab = findViewById<View>(R.id.AddAccount) as FloatingActionButton

        fab.setOnClickListener {
            val inCreate = Intent(this@ViewAccount, AddAccount::class.java)
            startActivity(inCreate)
        }
    }
}
