package com.erving.doctor

import android.content.Context
import android.widget.Toast

class Toas(message: String) {
//        private var toast: Toast? = null

        init {
            Toast.makeText(doctor.appContext, message, Toast.LENGTH_SHORT).show()

        }



}