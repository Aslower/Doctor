package com.erving.doctor

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"MainActivity", Toast.LENGTH_SHORT).show()

    }

    override fun onBackPressed() {
//        super.onBackPressed()
        val intent= Intent(Intent.ACTION_MAIN)
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.flags= Intent.FLAG_ACTIVITY_NEW_TASK
        intent.addCategory(Intent.CATEGORY_HOME)
        startActivity(intent)
    }


}
