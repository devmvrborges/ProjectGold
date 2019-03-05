package com.mvrborges.projectgold.category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mvrborges.projectgold.R;

public class ViewCategory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.category_title_view));
        setContentView(R.layout.activity_view_category);
    }
}
