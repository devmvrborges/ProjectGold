package com.mvrborges.projectgold.account;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.mvrborges.projectgold.R;

public class AddAccount extends AppCompatActivity {

    Spinner drpType;
    EditText txtBestDay;
    EditText txtDatePayment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.account_title));
        setContentView(R.layout.activity_add_account);

        txtBestDay = findViewById(R.id.txtBestDay);
        txtDatePayment = findViewById(R.id.txtDatePayment);

        drpType = findViewById(R.id.drpType);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.type_account, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        drpType.setAdapter(adapter);


        drpType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int index = arg0.getSelectedItemPosition();

                switch (index) {
                    case 0: {
                        clearFields();
                        txtBestDay.setVisibility(View.GONE);
                        txtDatePayment.setVisibility(View.GONE);
                        break;
                    }

                    case 1: {
                        clearFields();
//                        Toast.makeText(getBaseContext(), "conta corrente" + index, Toast.LENGTH_SHORT).show();
                        txtBestDay.setVisibility(View.GONE);
                        txtDatePayment.setVisibility(View.GONE);
                        break;
                    }
                    case 2: {
                        clearFields();
//                        Toast.makeText(getBaseContext(), "poupanca" + index, Toast.LENGTH_SHORT).show();
                        txtBestDay.setVisibility(View.GONE);
                        txtDatePayment.setVisibility(View.GONE);
                        break;
                    }
                    case 3: {
                        clearFields();
//                        Toast.makeText(getBaseContext(), "cartao de credito" + index, Toast.LENGTH_SHORT).show();
                        txtBestDay.setVisibility(View.VISIBLE);
                        txtDatePayment.setVisibility(View.VISIBLE);
                        break;
                    }
                }
            }
//                Toast.makeText(getBaseContext(),
//                        "You have selected item : " + index,
//                        Toast.LENGTH_SHORT).show();


            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public void clearFields() {
        txtBestDay.setText("");
        txtDatePayment.setText("");
    }

    public void onClickBtnCancel(View view) {
    }

    public void onClickBtnCreate(View view) {
    }
}
