package com.mvrborges.projectgold.category;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.mvrborges.projectgold.R;
import com.mvrborges.projectgold.configs.Main;
import com.mvrborges.projectgold.model.Category;
import com.mvrborges.projectgold.model.Persona;

import java.util.UUID;

public class AddCategory extends AppCompatActivity {

    EditText txtName;
    Spinner drpType;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    int drpTypeIndex;
    ArrayAdapter<CharSequence> adapter;
    Category categodrySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_category);
        this.setTitle(getResources().getText(R.string.category_title));

        Intent intent = getIntent();



        txtName = findViewById(R.id.txtName);
        drpType = findViewById(R.id.drpType);
        adapter = ArrayAdapter.createFromResource(this,
                R.array.type_action, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        drpType.setAdapter(adapter);

        drpType.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                drpTypeIndex = arg0.getSelectedItemPosition();


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        inicializarFirebase();
    }


    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = firebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();
    }

    public void onClickBtnCancel(View view) {
        Intent inCreate = new Intent(AddCategory.this, ViewCategory.class);
        startActivity(inCreate);
    }

    public void onClickBtnCreate(View view) {
        String nome = txtName.getText().toString();
        String type = drpType.getSelectedItem().toString();

        if (nome.equals("") || drpTypeIndex == 0) {
            validateFeilds();
        } else {
            Category p = new Category();
            p.setUid(UUID.randomUUID().toString());
            p.setName(nome);
            p.setType(type);
            databaseReference.child("Category").child(p.getUid()).setValue(p);

            Toast.makeText(this, "add category", Toast.LENGTH_LONG).show();
            clearFields();
            Intent inCreate = new Intent(AddCategory.this, ViewCategory.class);
            startActivity(inCreate);
        }
    }

    private void clearFields() {
        drpTypeIndex = 0;
        txtName.setText("");
        drpType.setAdapter(adapter);
    }

    private void validateFeilds() {
        String name = txtName.getText().toString();

        if (name.equals("")) {
            txtName.setError("Obrigatorio");
        } else if (drpTypeIndex == 0) {
            Toast.makeText(getBaseContext(),
                    "Obrigatorio",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
