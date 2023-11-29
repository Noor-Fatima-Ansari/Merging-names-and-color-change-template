package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Birthday : AppCompatActivity() {
    companion object{   val keyValue="keyValue" }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)

      var getvalue=intent.getStringExtra(keyValue)
        var bday=findViewById<TextView>(R.id.bday)
       bday.setText("Happy Birthday\n $getvalue")


    }
}