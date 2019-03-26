package com.mvrborges.projectgold.income

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.view.View
import com.mvrborges.projectgold.Expense.AddExpense

import com.mvrborges.projectgold.R

class ViewIncome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.income_title_view)
        setContentView(R.layout.activity_view_income)

        val fab = findViewById<View>(R.id.AddIncome) as FloatingActionButton

        fab.setOnClickListener {
            val inCreate = Intent(this@ViewIncome, AddIncome::class.java)
            startActivity(inCreate)
        }
    }
}
