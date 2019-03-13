package com.mvrborges.projectgold.configs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.mvrborges.projectgold.CRUDexample
import com.mvrborges.projectgold.Expense.AddExpense
import com.mvrborges.projectgold.R
import com.mvrborges.projectgold.Expense.ViewExpense
import com.mvrborges.projectgold.account.AddAccount
import com.mvrborges.projectgold.account.ViewAccount
import com.mvrborges.projectgold.category.AddCategory
import com.mvrborges.projectgold.category.ViewCategory
import com.mvrborges.projectgold.income.AddIncome
import com.mvrborges.projectgold.income.ViewIncome
import com.mvrborges.projectgold.transfers.AddTransfer
import com.mvrborges.projectgold.transfers.ViewTransfer

class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin = findViewById<View>(R.id.login) as Button
        val btnAddDespesa = findViewById<View>(R.id.addDespesa) as Button
        val btnViewDespesa = findViewById<View>(R.id.viewDespesa) as Button
        val btnAddRenda = findViewById<View>(R.id.addRenda) as Button
        val btnViewRenda = findViewById<View>(R.id.viewRenda) as Button
        val btnAddConta = findViewById<View>(R.id.addConta) as Button
        val btnViewConta = findViewById<View>(R.id.viewConta) as Button
        val btnAddTransferencia = findViewById<View>(R.id.addTransferencia) as Button
        val btnViewTransferencia = findViewById<View>(R.id.viewTransferencia) as Button
        val btnAddCategoria = findViewById<View>(R.id.addCategorias) as Button
        val btnViewCategoria = findViewById<View>(R.id.viewCategoria) as Button
        val btnExtrato = findViewById<View>(R.id.extrato) as Button
        val btnDashboard = findViewById<View>(R.id.dashboard) as Button
        val btnConfigs = findViewById<View>(R.id.config) as Button
        val btnAbout = findViewById<View>(R.id.about) as Button
    }

    fun onClickLogin(view: View) {
        val inCreate = Intent(this@Main, Login::class.java)
        startActivity(inCreate)
    }

    fun onClickAddDespesa(view: View) {
        val inCreate = Intent(this@Main, AddExpense::class.java)
        startActivity(inCreate)
    }

    fun onClickViewDespesa(view: View) {
        val inCreate = Intent(this@Main, ViewExpense::class.java)
        startActivity(inCreate)
    }

    fun onClickAddRenda(view: View) {
        val inCreate = Intent(this@Main, AddIncome::class.java)
        startActivity(inCreate)
    }

    fun onClickViewRenda(view: View) {
        val inCreate = Intent(this@Main, ViewIncome::class.java)
        startActivity(inCreate)
    }

    fun onClickAddConta(view: View) {
        val inCreate = Intent(this@Main, AddAccount::class.java)
        startActivity(inCreate)
    }

    fun onClickViewConta(view: View) {
        val inCreate = Intent(this@Main, ViewAccount::class.java)
        startActivity(inCreate)
    }

    fun onClickAddTransferencia(view: View) {
        val inCreate = Intent(this@Main, AddTransfer::class.java)
        startActivity(inCreate)
    }

    fun onClickViewTransferencia(view: View) {
        val inCreate = Intent(this@Main, ViewTransfer::class.java)
        startActivity(inCreate)
    }

    fun onClickAddCategoria(view: View) {
        val inCreate = Intent(this@Main, AddCategory::class.java)
        startActivity(inCreate)
    }

    fun onClickViewCategoria(view: View) {
        val inCreate = Intent(this@Main, ViewCategory::class.java)
        startActivity(inCreate)
    }

    fun onClickExtrato(view: View) {}

    fun onClickDashboard(view: View) {}

    fun onClickConfigs(view: View) {
        val inCreate = Intent(this, Configs::class.java)
        startActivity(inCreate)
    }

    fun onClickAbout(view: View) {
        val inCreate = Intent(this@Main, CRUDexample::class.java)
        startActivity(inCreate)
    }
}
