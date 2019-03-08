package com.mvrborges.projectgold.category;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.mvrborges.projectgold.CRUDexample;
import com.mvrborges.projectgold.R;
import com.mvrborges.projectgold.configs.Main;
import com.mvrborges.projectgold.model.Category;
import com.mvrborges.projectgold.model.Persona;

import java.util.ArrayList;
import java.util.List;

public class ViewCategory extends AppCompatActivity {
    private List<Category> listPerson = new ArrayList<Category>();
    ArrayAdapter<Category> personaArrayAdapter;
    public ListView listView_category;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    Category categodrySelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle(getResources().getText(R.string.category_title_view));
        setContentView(R.layout.activity_view_category);

        listView_category = findViewById(R.id.lv_category);

        FloatingActionButton fab = findViewById(R.id.AddCategory);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inCreate = new Intent(ViewCategory.this, AddCategory.class);
                startActivity(inCreate);
            }
        });


        inicializarFirebase();
        fillCategory();


        listView_category.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                categodrySelected = (Category) parent.getItemAtPosition(position);

                Intent i = new Intent(ViewCategory.this,AddCategory.class);
                i.putExtra("MainDate", parent.getItemAtPosition(position).toString());
            }
        });
    }






    private void inicializarFirebase() {
        FirebaseApp.initializeApp(this);
        firebaseDatabase = firebaseDatabase.getInstance();
        //firebaseDatabase.setPersistenceEnabled(true);

        databaseReference = firebaseDatabase.getReference();
    }

    private void fillCategory() {
        databaseReference.child("Category").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                listPerson.clear();
                for (DataSnapshot objSnapshot : dataSnapshot.getChildren()) {
                    Category p = objSnapshot.getValue(Category.class);
                    listPerson.add(p);

                    personaArrayAdapter = new ArrayAdapter<Category>(ViewCategory.this, android.R.layout.simple_list_item_1, listPerson);
                    listView_category.setAdapter(personaArrayAdapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
