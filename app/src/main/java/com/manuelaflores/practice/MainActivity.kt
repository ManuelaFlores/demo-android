package com.manuelaflores.practice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        Log.d("tag:Prueba" , "Es onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("tag:Prueba" , "Es onStop")
    }

    override fun onPause() {
        super.onPause()
        Log.d("tag:Prueba" , "Es onPause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("tag:Prueba" , "Es onDestroy")
    }

    override fun onResume() {
        super.onResume()
        Log.d("tag:Prueba" , "Es onResume")
    }



}
