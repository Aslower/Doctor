package com.erving.doctor.Activity

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
import android.view.View.SYSTEM_UI_FLAG_VISIBLE
import android.widget.Toast
import com.erving.doctor.R
import com.erving.doctor.Toas
import kotlinx.android.synthetic.main.activity_login.*

//import com.tencent.mm.opensdk.openapi.WXTextObject

class LoginPage:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        Toas("LoginP")
        changeStatusBarTextImgColor(true);
//        if(savedInstanceState!=null){
//            val intent=Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
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
//            if(!isPassWordValid(password.text)){
//                password.error=getString(R.string.errorPassword)
//            }else{
//                password.error=null
//                val intent=Intent(this,MainActivity::class.java)
//                finish()
//                startActivity(intent)
//
//            }
            val intent=Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent)
        }
//        Final SendAuth.Req req = new SendAuth.Req();
//        req.scope = "snsapi_userinfo";
//        req.state = "wechat_sdk_demo_test";
//        api.sendReq(req);

    }

    private fun isPassWordValid(text:Editable?):Boolean{
        return text!=null&&text.length>=8
    }
    fun changeStatusBarTextImgColor(isBlack:Boolean):Unit {
        if (isBlack) {
            //设置状态栏黑色字体
            window.decorView.systemUiVisibility= SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        } else {
            //恢复状态栏白色字体
            window.decorView.systemUiVisibility= SYSTEM_UI_FLAG_VISIBLE
        }
    }

}