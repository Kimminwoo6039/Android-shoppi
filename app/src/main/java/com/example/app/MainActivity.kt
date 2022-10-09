package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"ZZZZ")
    }


    override fun onResume() {
        super.onResume()
        Log.d(TAG,"eeee")
    }
}