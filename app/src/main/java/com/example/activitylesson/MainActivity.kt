package com.example.activitylesson

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MAIN_ACTIVITY"

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private lateinit var btnFinish: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        btnFinish = findViewById(R.id.btn_finish)
        log("OnCreate")
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
        log("OnResume")
    }

    override fun onBackPressed() {
        super.onBackPressed()
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