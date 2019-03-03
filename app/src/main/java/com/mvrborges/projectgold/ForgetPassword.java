package com.mvrborges.projectgold;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
