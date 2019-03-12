package com.mvrborges.projectgold

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast

import com.google.firebase.FirebaseApp
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.mvrborges.projectgold.model.Persona

import java.util.ArrayList
import java.util.UUID

class CRUDexample : AppCompatActivity() {

    private val listPerson = ArrayList<Persona>()
    internal lateinit var personaArrayAdapter: ArrayAdapter<Persona>

    lateinit var nombreP: EditText
    lateinit var sobrenomeP: EditText
    lateinit var correoP: EditText
    lateinit var listView_pessoas: ListView

//    internal lateinit var firebaseDatabase: FirebaseDatabase
//    internal lateinit var databaseReference: DatabaseReference

    lateinit var _db: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crudexample)




        nombreP = findViewById(R.id.txtNombre)
        sobrenomeP = findViewById(R.id.txtSobrenome)
        correoP = findViewById(R.id.txtCorreo)

        listView_pessoas = findViewById(R.id.lv_dadosPessoas)

        _db = FirebaseDatabase.getInstance().reference

//        firebaseDatabase = FirebaseDatabase.getInstance().reference
       // inicializarFirebase()
//        listarDados()
    }

//    private fun listarDados() {
//        databaseReference.child("Persona").addValueEventListener(object : ValueEventListener {
//            override fun onDataChange(dataSnapshot: DataSnapshot) {
//                listPerson.clear()
//                for (objSnapshot in dataSnapshot.children) {
//                    val p = objSnapshot.getValue<Persona>(Persona)
//                    if (p != null) {
//                        listPerson.add(p)
//                    }
//
//                    personaArrayAdapter = ArrayAdapter(this@CRUDexample, android.R.layout.simple_list_item_1, listPerson)
//                    listView_pessoas.adapter = personaArrayAdapter
//                }
//            }
//
//            override fun onCancelled(databaseError: DatabaseError) {
//
//            }
//        })
//    }

//    private fun inicializarFirebase() {
//        FirebaseApp.initializeApp(this)
//        firebaseDatabase = firebaseDatabase.getInstance()
//        //firebaseDatabase.setPersistenceEnabled(true);
//
//        databaseReference = firebaseDatabase.reference
//    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        val nome = nombreP.text.toString()
//        val sobrenome = sobrenomeP.text.toString()
//        val email = correoP.text.toString()
//
//        when (item.itemId) {
//            R.id.icon_add -> {
//                if (nome == "" || sobrenome == "" || email == "") {
//                    validation()
//                } else {
//                    val p = Persona()
//                    p.uid = UUID.randomUUID().toString()
//                    p.nome = nome
//                    p.sobrenome = sobrenome
//                    p.email = email
//                    databaseReference.child("Persona").child(p.uid).setValue(p)
//
//
//                    Toast.makeText(this, "add", Toast.LENGTH_LONG).show()
//                    clearFields()
//                }
//            }
//            R.id.icon_save -> {
//                Toast.makeText(this, "save", Toast.LENGTH_LONG).show()
//            }
//            R.id.icon_delete -> {
//                Toast.makeText(this, "delete", Toast.LENGTH_LONG).show()
//            }
//            else -> {
//            }
//        }
//        return true
//    }

    private fun clearFields() {
        nombreP.setText("")
        sobrenomeP.setText("")
        correoP.setText("")
    }

    private fun validation() {
        val nome = nombreP.text.toString()
        val sobre = sobrenomeP.text.toString()
        val email = correoP.text.toString()

        if (nome == "") {
            nombreP.error = "Obrigatorio"
        } else if (sobre == "") {
            sobrenomeP.error = "sobre Obrigatorio"
        } else if (email == "") {
            correoP.error = "email Obrigatorio"
        }
    }
}
