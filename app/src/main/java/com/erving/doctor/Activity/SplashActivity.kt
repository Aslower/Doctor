package com.erving.doctor

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast

//为何在instant模式下oppo无法打开app
class SplashActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Toast.makeText(this,"SplashActiviy",Toast.LENGTH_SHORT).show()

        //Jump to LoginPage
        val handler = Handler() //Handler handler = new Handler();
        handler.postDelayed({ //handler.postDelayed(new Runnable() {
            //@Override
            //       public void run() {
//            val intent = Intent(this@SplashActivity, LoginPage::class.java)
            val intent=Intent(this,LoginPage::class.java)
            startActivity(intent)
            finish()
        }, 1500)  //毫秒

<<<<<<< HEAD:app/src/main/java/com/erving/doctor/SplashActivity.kt
=======

>>>>>>> mainActivity:app/src/main/java/com/erving/doctor/Activity/SplashActivity.kt

    }



}