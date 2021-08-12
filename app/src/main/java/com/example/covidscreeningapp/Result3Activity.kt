package com.example.covidscreeningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Result3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result3)

        var title: TextView =findViewById(R.id.txt_title)
        var detail: TextView =findViewById(R.id.txt_detail)
        var instruction: TextView =findViewById(R.id.txt_instruction)

        title.setText(getText(R.string.heading_r3))
        detail.setText(getText(R.string.result_3))
        instruction.setText(getText(R.string.instruction))
    }
}