package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        Log.d(TAG,"onCreate12")


    }

    

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }


    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResuum")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }
}