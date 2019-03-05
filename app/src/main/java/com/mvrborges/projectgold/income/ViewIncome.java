package com.mvrborges.projectgold.income;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvrborges.projectgold.R;

public class ViewIncome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.income_title_view));
        setContentView(R.layout.activity_view_income);

    }
}
