package com.mvrborges.projectgold.Expense

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

import com.mvrborges.projectgold.R

class ViewExpense : AppCompatActivity() {
    internal var list: ListView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.expense_title_view)
        setContentView(R.layout.activity_view_expense)
    }
}
