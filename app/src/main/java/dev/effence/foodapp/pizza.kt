package dev.effence.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pizza : AppCompatActivity() {
    lateinit var btnback1:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)
        btnback1=findViewById(R.id.btnback1)
        btnback1.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext2=findViewById(R.id.btnNext2)
        btnNext2.setOnClickListener {
            val  intent=Intent(this,vegesActivity::class.java)
            startActivity(intent)
        }
    }
}