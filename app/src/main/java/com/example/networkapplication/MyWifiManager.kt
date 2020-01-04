package com.example.networkapplication

import android.net.wifi.WifiManager
import android.util.Log

class MyWifiManager( obj: Any? ) {
	private var manager : WifiManager

	companion object {
		const val loggerTag : String = "MyWifiManager"
	}

	init {
		Log.d(loggerTag, "constructor")
		this.manager = obj as WifiManager
		Log.i(loggerTag, this.manager.isP2pSupported.toString())
		Log.i(loggerTag, "constructor")
	}

	fun print() {
		Log.i(loggerTag, "########################################################################")
		Log.i(loggerTag, this.manager.connectionInfo.toString() + ", " + this.manager.isP2pSupported.toString() + ", " + this.manager.isWifiEnabled.toString())
		Log.i(loggerTag, "########################################################################")
	}
}