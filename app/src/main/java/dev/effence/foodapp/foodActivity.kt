package dev.effence.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class foodActivity : AppCompatActivity() {
    lateinit var btnback3: Button
    lateinit var btnNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        btnback3 = findViewById(R.id.btnback3)
        btnback3.setOnClickListener {
            val intent = Intent(this, vegesActivity::class.java)
            startActivity(intent)
        }
        btnNext4 = findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent = Intent(this, wineActivity::class.java)
            startActivity(intent)
        }
    }
}