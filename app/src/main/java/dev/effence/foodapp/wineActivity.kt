package dev.effence.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class wineActivity : AppCompatActivity() {
    lateinit var btnback4: Button
    lateinit var btnNext5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wine)
        btnback4 = findViewById(R.id.btnback4)
        btnback4.setOnClickListener {
            val intent = Intent(this, foodActivity::class.java)
            startActivity(intent)
        }
        btnNext5 = findViewById(R.id.btnNext5)
        btnNext5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}