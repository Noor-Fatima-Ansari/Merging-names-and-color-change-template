package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint

class MainActivity : AppCompatActivity() {


//    var meargeData= "$firstValue $secondValue"
  //  var secondValue

    override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContentView(R.layout.activity_main)




/*
         **************MERGING THE FIELDS NAMES******************

        var firstValue=findViewById<EditText>(R.id.entertext1)
        var secondValue=findViewById<EditText>(R.id.entertext2)
        var b1=findViewById<Button>(R.id.b1)
        var h1=findViewById<TextView>(R.id.h1)
       b1.setOnClickListener {
           var first=firstValue.getText()
           var second=secondValue.text
           var merge= "$first  $second"
           h1.setText(merge)
       }

*/



/*
      //********************** CHANGE COLOR *****************

        var b1=findViewById<Button>(R.id.b1)
        var b2=findViewById<Button>(R.id.b2)
        var bg=findViewById<ConstraintLayout>(R.id.layout)

      b1.setOnClickListener{
          bg.setBackgroundColor(R.color.black)
      }
      b2.setOnClickListener{
          bg.setBackgroundColor(R.color.white)
      }
*/
 */



        // **********BIRTHDAY APP***********

        var b=findViewById<Button>(R.id.b)
        var text=findViewById<TextView>(R.id.text)

        b.setOnClickListener {
       var name =   (text.getText()).toString()  //-> getText() give char sequence and we need String
         //   var name=text.editableText.toString()   // This method also give us input String
           // **set intent and send name to another activity**
         var intent=Intent(this,Birthday::class.java)
            intent.putExtra(Birthday.keyValue, name)
            startActivity(intent)


        }



    }
}
