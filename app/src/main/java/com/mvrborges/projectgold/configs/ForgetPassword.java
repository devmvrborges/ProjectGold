package com.mvrborges.projectgold.configs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mvrborges.projectgold.R;

public class ForgetPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.forgetPassword_title));
        setContentView(R.layout.activity_forget_password);


    }

    public void onClickBtnCancel(View view) {
        Intent inCreate = new Intent(ForgetPassword.this, Login.class);
        startActivity(inCreate);
    }

    public void onClickBtnCreate(View view) {
        Intent inCreate = new Intent(ForgetPassword.this, Login.class);
        startActivity(inCreate);
    }
}
