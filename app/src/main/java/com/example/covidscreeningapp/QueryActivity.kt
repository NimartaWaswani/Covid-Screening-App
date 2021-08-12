package com.example.covidscreeningapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox

class QueryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_query)

        var submit:Button=findViewById(R.id.btn_submit)

        var c1:CheckBox=findViewById(R.id.cb1)
        var c2:CheckBox=findViewById(R.id.cb2)
        var c3:CheckBox=findViewById(R.id.cb3)
        var c4:CheckBox=findViewById(R.id.cb4)
        var c5:CheckBox=findViewById(R.id.cb5)
        var c6:CheckBox=findViewById(R.id.cb6)
        var c7:CheckBox=findViewById(R.id.cb7)
        var c8:CheckBox=findViewById(R.id.cb8)
        var c9:CheckBox=findViewById(R.id.cb9)
        var c10:CheckBox=findViewById(R.id.cb10)

        submit.setOnClickListener(){
            if(
                (c1.isChecked) && ((c2.isChecked)||(c3.isChecked)) && (c4.isChecked) && (c6.isChecked) && (c8.isChecked)&&
                (c9.isChecked)&&(c10.isChecked)

            ){
                var intent=Intent(this,ResultActivity::class.java)
                startActivity(intent)

            }
             else if (
                (c1.isChecked) &&( (c2.isChecked) || c3.isChecked) && ((c4.isChecked) || (c5.isChecked)||(c8.isChecked))
            )
            {
                var intent=Intent(this,Result2Activity::class.java)
                startActivity(intent)

            }
            else {
                var intent=Intent(this,Result3Activity::class.java)
                startActivity(intent)

            }

        }





//        if(((c1 && c2 && c4 && c6 && c8 && c9)==true) &&  ((c3 && c5 && c7 && c10)==true||false))
//        {
//            var intent =Intent(this,ResultActivity::class.java)
//            startActivity(in)
//        }
//        else if(
//            ((c1 && c2 && c4)==true)&& ((c3 && c5 && c6 && c7 && c10)==true||false)
//            && ((c8 && c9)==true||false)
//        )
//        {
//            print("Result 2")
//        }
//        else{
//            print("Result 3")
//        }


    }
}