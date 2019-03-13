package com.mvrborges.projectgold.income

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.mvrborges.projectgold.R

class ViewIncome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.income_title_view)
        setContentView(R.layout.activity_view_income)

    }
}
