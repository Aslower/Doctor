package com.erving.doctor

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

class LoginPage:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        Toast.makeText(this,"LoginPage",Toast.LENGTH_SHORT).show()
    }

    fun ClickLogin(){

    }




}