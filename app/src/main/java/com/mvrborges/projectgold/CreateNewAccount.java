package com.mvrborges.projectgold;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CreateNewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.createLogin_title));
        setContentView(R.layout.activity_create_new_account);
    }

    public void onClickBtnCancel(View view) {
        Intent inCreate = new Intent(CreateNewAccount.this, Login.class);
        startActivity(inCreate);
    }

    public void onClickBtnCreate(View view) {
        Intent inCreate = new Intent(CreateNewAccount.this, Login.class);
        startActivity(inCreate);
    }
}
