package com.mvrborges.projectgold.transfers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.mvrborges.projectgold.R;

public class AddTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.transfer_title));
        setContentView(R.layout.activity_add_transfer);
    }

    public void onClickBtnCreate(View view) {
    }

    public void onClickBtnCancel(View view) {
    }
}
