package com.example.covidscreeningapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var title:TextView=findViewById(R.id.txt_title)
        var detail:TextView=findViewById(R.id.txt_detail)
        var instruction:TextView=findViewById(R.id.txt_instruction)

        title.setText(getText(R.string.heading_r1))
        detail.setText(getText(R.string.result_1))
        instruction.setText(getText(R.string.instruction))
    }
}