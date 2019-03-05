package com.mvrborges.projectgold.account;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvrborges.projectgold.R;

public class ViewAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.account_title_view));
        setContentView(R.layout.activity_view_account);
    }
}
