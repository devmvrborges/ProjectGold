package com.mvrborges.projectgold.category;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.mvrborges.projectgold.R;

public class AddCategory extends AppCompatActivity {

    Spinner drpType;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
        this.setTitle(getResources().getText(R.string.category_title));

        drpType = findViewById(R.id.drpType);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.type_action, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        drpType.setAdapter(adapter);
    }

    public void onClickBtnCancel(View view) {
    }

    public void onClickBtnCreate(View view) {
    }
}
