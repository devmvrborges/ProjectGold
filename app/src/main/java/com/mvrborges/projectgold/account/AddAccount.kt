package com.mvrborges.projectgold.account

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

import com.mvrborges.projectgold.R

class AddAccount : AppCompatActivity() {

    internal lateinit var drpType: Spinner
    internal lateinit var txtBestDay: EditText
    internal lateinit var txtDatePayment: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setTitle(getResources().getText(R.string.account_title))
        setContentView(R.layout.activity_add_account)

        txtBestDay = findViewById(R.id.txtBestDay)
        txtDatePayment = findViewById(R.id.txtDatePayment)

        drpType = findViewById(R.id.drpType)
        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter.createFromResource(this,
                R.array.type_account, android.R.layout.simple_spinner_item)
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Apply the adapter to the spinner
        drpType.adapter = adapter


        drpType.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(arg0: AdapterView<*>, arg1: View, arg2: Int, arg3: Long) {
                val index = arg0.selectedItemPosition

                when (index) {
                    0 -> {
                        clearFields()
                        txtBestDay.visibility = View.GONE
                        txtDatePayment.visibility = View.GONE
                    }

                    1 -> {
                        clearFields()
                        //                        Toast.makeText(getBaseContext(), "conta corrente" + index, Toast.LENGTH_SHORT).show();
                        txtBestDay.visibility = View.GONE
                        txtDatePayment.visibility = View.GONE
                    }
                    2 -> {
                        clearFields()
                        //                        Toast.makeText(getBaseContext(), "poupanca" + index, Toast.LENGTH_SHORT).show();
                        txtBestDay.visibility = View.GONE
                        txtDatePayment.visibility = View.GONE
                    }
                    3 -> {
                        clearFields()
                        //                        Toast.makeText(getBaseContext(), "cartao de credito" + index, Toast.LENGTH_SHORT).show();
                        txtBestDay.visibility = View.VISIBLE
                        txtDatePayment.visibility = View.VISIBLE
                    }
                }
            }
            //                Toast.makeText(getBaseContext(),
            //                        "You have selected item : " + index,
            //                        Toast.LENGTH_SHORT).show();


            override fun onNothingSelected(arg0: AdapterView<*>) {}
        }
    }

    fun clearFields() {
        txtBestDay.setText("")
        txtDatePayment.setText("")
    }

    fun onClickBtnCancel(view: View) {}

    fun onClickBtnCreate(view: View) {}
}
