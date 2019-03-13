package com.mvrborges.projectgold.transfers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner

import com.mvrborges.projectgold.R

class AddTransfer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.title = resources.getText(R.string.transfer_title)
        setContentView(R.layout.activity_add_transfer)

        val drpCategory = findViewById<View>(R.id.drpDestiny) as Spinner
        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(this,
                R.array.itens_Mock, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        drpCategory.adapter = adapter

        val drpAccount = findViewById<View>(R.id.drpOrigin) as Spinner
        val adapter2 = ArrayAdapter.createFromResource(this,
                R.array.itens_Mock, android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        drpAccount.adapter = adapter2
    }

    fun onClickBtnCreate(view: View) {}

    fun onClickBtnCancel(view: View) {}
}
