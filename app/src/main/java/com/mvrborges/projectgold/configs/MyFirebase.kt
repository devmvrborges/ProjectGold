package com.mvrborges.projectgold.configs

import com.google.firebase.database.FirebaseDatabase

class MyFirebase : android.app.Application() {
    override fun onCreate() {
        super.onCreate()
        FirebaseDatabase.getInstance().setPersistenceEnabled(true)
    }
}
