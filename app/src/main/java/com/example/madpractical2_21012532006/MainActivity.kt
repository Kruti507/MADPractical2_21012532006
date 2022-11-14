package com.example.madpractical2_21012532006

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mylayout: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onCreate: function called")
        Toast.makeText(this,"onCreate: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onCreate: function called",Snackbar.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onStart: function called")
        Toast.makeText(this,"onStart: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onStart: function called",Snackbar.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onRestart: function called")
        Toast.makeText(this,"onRestart: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onRestart: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onResume: function called")
        Toast.makeText(this,"onResume: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onResume: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onPause: function called")
        Toast.makeText(this,"onPause: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onPause: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onStop: function called")
        Toast.makeText(this,"onStop: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onStop: function called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        mylayout=findViewById(R.id.my_ConstLay)
        Log.i(TAG, "onDestroy: function called")
        Toast.makeText(this,"onDestroy: function called",Toast.LENGTH_LONG).show()
        Snackbar.make(mylayout,"onDestroy: function called",Snackbar.LENGTH_LONG).show()
    }
}