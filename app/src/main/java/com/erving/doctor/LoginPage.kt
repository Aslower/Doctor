package com.erving.doctor

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.widget.Toast
import kotlinx.android.synthetic.main.login.*
import kotlinx.android.synthetic.main.login.view.*

class LoginPage:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        Toast.makeText(this, "LoginPage", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
//        password.setOnClickListener {
//            if(!isPassWordValid(password.text)){
//                pass
//            }
//        }

        login.setOnClickListener {
            Toast.makeText(this,"loginButton",Toast.LENGTH_SHORT).show()
            if(!isPassWordValid(password.text)){
                password.error=getString(R.string.errorPassword)
            }else{
                password.error=null
                val intent=Intent(this,MainActivity::class.java)
                startActivity(intent)
                finish()
            }

        }
    }



    private fun isPassWordValid(text:Editable?):Boolean{
        return text!=null&&text.length>=8
    }

}