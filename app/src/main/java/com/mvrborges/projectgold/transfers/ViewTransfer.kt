package com.mvrborges.projectgold.transfers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.mvrborges.projectgold.R

class ViewTransfer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.transfer_title_view)
        setContentView(R.layout.activity_view_transfer)
    }
}
