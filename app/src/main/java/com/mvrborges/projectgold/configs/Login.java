package com.mvrborges.projectgold.configs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mvrborges.projectgold.R;

public class Login extends AppCompatActivity {


//    final Button btnForget = findViewById(R.id.btnForget);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.login_title));
        setContentView(R.layout.activity_login);

        Button btnCreate = (Button) findViewById(R.id.btnCreate);
        Button btnForget = (Button) findViewById(R.id.btnForget);

    }

    public void onClickBtnSign(View view) {
        Intent inCreate = new Intent(Login.this, CreateNewAccount.class);
        startActivity(inCreate);
    }

    public void onClickBtnForget(View view) {
        Intent inCreate = new Intent(Login.this, ForgetPassword.class);
        startActivity(inCreate);
    }
}
