package com.erving.doctor

import android.app.Application
import android.content.Context

class doctor : Application() {

    override fun onCreate() {
        super.onCreate()
        doctor.appContext = applicationContext
    }

    companion object {
        var appContext: Context? = null
            private set
    }
}