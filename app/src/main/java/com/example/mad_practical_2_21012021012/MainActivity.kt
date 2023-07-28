package com.example.mad_practical_2_21012021012

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate Method is called !!")
    }

    fun showMessage(message: String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val v:ConstraintLayout?=findViewById(R.id.myConstraintLayout)
        if(v != null)
        {
            Snackbar.make(v,
                    message,
                    Snackbar.LENGTH_SHORT
            ).show()
        }

    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart Method is called !!")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume Method is called !!")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("OnRestart Method is called !!")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause Method is called !! ")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop Method is called !!")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is called !!")
    }
}