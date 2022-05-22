package dev.effence.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vegesActivity : AppCompatActivity() {
    lateinit var btnback2: Button
    lateinit var btnNext3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_veges)
        btnback2 = findViewById(R.id.btnback2)
        btnback2.setOnClickListener {
            val intent = Intent(this, pizza::class.java)
            startActivity(intent)
        }
        btnNext3 = findViewById(R.id.btnNext3)
        btnNext3.setOnClickListener {
            val intent = Intent(this, foodActivity::class.java)
            startActivity(intent)
        }
    }
}