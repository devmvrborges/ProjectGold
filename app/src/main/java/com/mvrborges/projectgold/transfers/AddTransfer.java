package com.mvrborges.projectgold.transfers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.mvrborges.projectgold.R;

public class AddTransfer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.transfer_title));
        setContentView(R.layout.activity_add_transfer);

        Spinner drpCategory = (Spinner) findViewById(R.id.drpDestiny);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.itens_Mock, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        drpCategory.setAdapter(adapter);

        Spinner drpAccount = (Spinner) findViewById(R.id.drpOrigin);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.itens_Mock, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drpAccount.setAdapter(adapter2);
    }

    public void onClickBtnCreate(View view) {
    }

    public void onClickBtnCancel(View view) {
    }
}
