package com.example.networkapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val connectivityManager = MyConnectivityManager(getSystemService(Context.CONNECTIVITY_SERVICE))
        connectivityManager.print()

        val wifiManager = MyWifiManager(getSystemService(Context.WIFI_SERVICE))
        wifiManager.print()
    }
}
