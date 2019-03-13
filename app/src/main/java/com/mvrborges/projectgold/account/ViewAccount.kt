package com.mvrborges.projectgold.account

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.mvrborges.projectgold.R

class ViewAccount : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.account_title_view)
        setContentView(R.layout.activity_view_account)
    }
}
