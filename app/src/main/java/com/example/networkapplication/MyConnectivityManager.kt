package com.example.networkapplication

import android.net.ConnectivityManager
import android.util.Log

class MyConnectivityManager( obj: Any? ) {
    private var manager : ConnectivityManager

    companion object {
        const val loggerTag : String = "MyConnectivityManager"
    }

    init {
        Log.d(loggerTag, "constructor")
        this.manager = obj as ConnectivityManager
        Log.i(loggerTag, this.manager.isDefaultNetworkActive.toString())
        Log.i(loggerTag, "constructor")
    }

    fun print() {
        Log.i(loggerTag, "########################################################################")
        this.manager.allNetworks.forEach { network ->
            Log.i(loggerTag, network.getByName(null).hostName)
        }
        Log.i(loggerTag, "########################################################################")
    }
}