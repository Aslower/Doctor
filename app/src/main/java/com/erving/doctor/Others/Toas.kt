package com.erving.doctor

import android.content.Context
import android.widget.Toast

class Toas {
//        private var toast: Toast? = null

        fun showToast(message: String) {
            Toast.makeText(doctor.appContext, message, Toast.LENGTH_SHORT).show()
        }



}