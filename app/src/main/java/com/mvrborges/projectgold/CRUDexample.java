package com.mvrborges.projectgold;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mvrborges.projectgold.model.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CRUDexample extends AppCompatActivity {

    private List<Persona> listPerson = new ArrayList<Persona>();
    ArrayAdapter<Persona> personaArrayAdapter;

    public EditText nombreP, sobrenomeP, correoP;
    public ListView listView_pessoas;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crudexample);

        nombreP = findViewById(R.id.txtNombre);
        sobrenomeP = findViewById(R.id.txtSobrenome);
        correoP = findViewById(R.id.txtCorreo);

        listView_pessoas = findViewById(R.id.lv_dadosPessoas);

        inicializarFirebase();
        listarDados();


    }

    private void listarDados() {
        databaseReference.child("Persona").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listPerson.clear();
                for(DataSnapshot objSnapshot : dataSnapshot.getChildren()){
                    Persona p = objSnapshot.getValue(Persona.class);
                    listPerson.add(p);

                    personaArrayAdapter = new ArrayAdapter<Persona>(CRUDexample.this, android.R.layout.simple_list_item_1, listPerson);
                    listView_pessoas.setAdapter(personaArrayAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = firebaseDatabase.getInstance();
        //firebaseDatabase.setPersistenceEnabled(true);

        databaseReference = firebaseDatabase.getReference();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String nome = nombreP.getText().toString();
        String sobrenome = sobrenomeP.getText().toString();
        String email = correoP.getText().toString();

        switch (item.getItemId()) {
            case R.id.icon_add: {
                if (nome.equals("") || sobrenome.equals("") || email.equals("")) {
                    validation();
                } else {
                    Persona p = new Persona();
                    p.setUid(UUID.randomUUID().toString());
                    p.setNome(nome);
                    p.setSobrenome(sobrenome);
                    p.setEmail(email);
                    databaseReference.child("Persona").child(p.getUid()).setValue(p);


                    Toast.makeText(this, "add", Toast.LENGTH_LONG).show();
                    clearFields();
                }
                break;
            }
            case R.id.icon_save: {
                Toast.makeText(this, "save", Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.icon_delete: {
                Toast.makeText(this, "delete", Toast.LENGTH_LONG).show();
                break;
            }
            default:
                break;
        }
        return true;
    }

    private void clearFields() {
        nombreP.setText("");
        sobrenomeP.setText("");
        correoP.setText("");
    }

    private void validation() {
        String nome = nombreP.getText().toString();
        String sobre = sobrenomeP.getText().toString();
        String email = correoP.getText().toString();

        if (nome.equals("")) {
            nombreP.setError("Obrigatorio");
        } else if (sobre.equals("")) {
            sobrenomeP.setError("sobre Obrigatorio");
        } else if (email.equals("")) {
            correoP.setError("email Obrigatorio");
        }
    }
}
