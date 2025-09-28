package com.example.activitylesson

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat

private const val TAG = "MAIN_ACTIVITY"

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var btnFinish: Button
    lateinit var transparentAct: Button
    lateinit var navigateBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnFinish = findViewById(R.id.btn_finish)
        transparentAct = findViewById(R.id.btn_transparent_activity)
        navigateBtn = findViewById(R.id.btn_navigate_to)
        log("OnCreate, savedState=$savedInstanceState")
    }

    override fun onStart() {
        super.onStart()
        log("OnStart")
    }

    override fun onResume() {
        super.onResume()
        btnFinish.setOnClickListener {
            finish()
        }
        navigateBtn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }


//        transparentAct.setOnClickListener {
//            ActivityCompat.requestPermissions(
//                this,
//                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
//                1
//            )
//        }
        log("OnResume")
    }

    override fun onPause() {
        super.onPause()
        log("OnPause")
    }

    override fun onStop() {
        super.onStop()
        log("OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        log("OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        log("OnDestroy")
    }

    private fun log(message: String) {
        Log.i(TAG, message)
    }
}