package com.mvrborges.projectgold;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
    }

    public void onClickViewDespesa(View view) {
    }

    public void onClickAddRenda(View view) {
    }

    public void onClickViewRenda(View view) {
    }

    public void onClickAddConta(View view) {
    }

    public void onClickViewConta(View view) {
    }

    public void onClickAddTransferencia(View view) {
    }

    public void onClickViewTransferencia(View view) {
    }

    public void onClickAddCategoria(View view) {
    }

    public void onClickViewCategoria(View view) {
    }

    public void onClickExtrato(View view) {
    }

    public void onClickDashboard(View view) {
    }

    public void onClickConfigs(View view) {
    }

    public void onClickAbout(View view) {
    }
}
