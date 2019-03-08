package com.mvrborges.projectgold.configs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mvrborges.projectgold.CRUDexample;
import com.mvrborges.projectgold.Expense.AddExpense;
import com.mvrborges.projectgold.R;
import com.mvrborges.projectgold.Expense.ViewExpense;
import com.mvrborges.projectgold.account.AddAccount;
import com.mvrborges.projectgold.account.ViewAccount;
import com.mvrborges.projectgold.category.AddCategory;
import com.mvrborges.projectgold.category.ViewCategory;
import com.mvrborges.projectgold.income.AddIncome;
import com.mvrborges.projectgold.income.ViewIncome;
import com.mvrborges.projectgold.transfers.AddTransfer;
import com.mvrborges.projectgold.transfers.ViewTransfer;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = (Button) findViewById(R.id.login);
        Button btnAddDespesa = (Button) findViewById(R.id.addDespesa);
        Button btnViewDespesa = (Button) findViewById(R.id.viewDespesa);
        Button btnAddRenda = (Button) findViewById(R.id.addRenda);
        Button btnViewRenda = (Button) findViewById(R.id.viewRenda);
        Button btnAddConta = (Button) findViewById(R.id.addConta);
        Button btnViewConta = (Button) findViewById(R.id.viewConta);
        Button btnAddTransferencia = (Button) findViewById(R.id.addTransferencia);
        Button btnViewTransferencia = (Button) findViewById(R.id.viewTransferencia);
        Button btnAddCategoria = (Button) findViewById(R.id.addCategorias);
        Button btnViewCategoria = (Button) findViewById(R.id.viewCategoria);
        Button btnExtrato = (Button) findViewById(R.id.extrato);
        Button btnDashboard = (Button) findViewById(R.id.dashboard);
        Button btnConfigs = (Button) findViewById(R.id.config);
        Button btnAbout = (Button) findViewById(R.id.about);
    }

    public void onClickLogin(View view) {
        Intent inCreate = new Intent(Main.this, Login.class);
        startActivity(inCreate);
    }

    public void onClickAddDespesa(View view) {
        Intent inCreate = new Intent(Main.this, AddExpense.class);
        startActivity(inCreate);
    }

    public void onClickViewDespesa(View view) {
        Intent inCreate = new Intent(Main.this, ViewExpense.class);
        startActivity(inCreate);
    }

    public void onClickAddRenda(View view) {
        Intent inCreate = new Intent(Main.this, AddIncome.class);
        startActivity(inCreate);
    }

    public void onClickViewRenda(View view) {
        Intent inCreate = new Intent(Main.this, ViewIncome.class);
        startActivity(inCreate);
    }

    public void onClickAddConta(View view) {
        Intent inCreate = new Intent(Main.this, AddAccount.class);
        startActivity(inCreate);
    }

    public void onClickViewConta(View view) {
        Intent inCreate = new Intent(Main.this, ViewAccount.class);
        startActivity(inCreate);
    }

    public void onClickAddTransferencia(View view) {
        Intent inCreate = new Intent(Main.this, AddTransfer.class);
        startActivity(inCreate);
    }

    public void onClickViewTransferencia(View view) {
        Intent inCreate = new Intent(Main.this, ViewTransfer.class);
        startActivity(inCreate);
    }

    public void onClickAddCategoria(View view) {
        Intent inCreate = new Intent(Main.this, AddCategory.class);
        startActivity(inCreate);
    }

    public void onClickViewCategoria(View view) {
        Intent inCreate = new Intent(Main.this, ViewCategory.class);
        startActivity(inCreate);
    }

    public void onClickExtrato(View view) {
    }

    public void onClickDashboard(View view) {
    }

    public void onClickConfigs(View view) {
    }

    public void onClickAbout(View view) {
        Intent inCreate = new Intent(Main.this, CRUDexample.class);
        startActivity(inCreate);
    }
}
