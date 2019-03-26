package com.mvrborges.projectgold.Expense

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

import com.mvrborges.projectgold.R
import com.mvrborges.projectgold.category.AddCategory

class ViewExpense : AppCompatActivity() {
    internal var list: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.expense_title_view)
        setContentView(R.layout.activity_view_expense)

        val fab = findViewById<View>(R.id.AddExpense) as FloatingActionButton

        fab.setOnClickListener {
            val inCreate = Intent(this@ViewExpense, AddExpense::class.java)
            startActivity(inCreate)
        }
    }
}
