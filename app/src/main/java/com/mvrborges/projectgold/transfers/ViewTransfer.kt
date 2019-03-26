package com.mvrborges.projectgold.transfers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View

import com.mvrborges.projectgold.R
import com.mvrborges.projectgold.income.AddIncome

class ViewTransfer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.transfer_title_view)
        setContentView(R.layout.activity_view_transfer)

        val fab = findViewById<View>(R.id.AddTransfer) as FloatingActionButton

        fab.setOnClickListener {
            val inCreate = Intent(this@ViewTransfer, AddTransfer::class.java)
            startActivity(inCreate)
        }

    }
}
