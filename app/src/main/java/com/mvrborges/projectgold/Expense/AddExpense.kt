package com.mvrborges.projectgold.Expense

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

import com.mvrborges.projectgold.R

class AddExpense : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_expense)
        this.title = resources.getText(R.string.expense_title)

        val drpCategory = findViewById<View>(R.id.drpCategory) as Spinner
        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(this,
                R.array.itens_Mock, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        drpCategory.adapter = adapter

        val drpAccount = findViewById<View>(R.id.drpAccount) as Spinner
        val adapter2 = ArrayAdapter.createFromResource(this,
                R.array.itens_Mock, android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        drpAccount.adapter = adapter2

    }


    fun onClickBtnCancel(view: View) {

    }

    fun onClickBtnCreate(view: View) {}
}
