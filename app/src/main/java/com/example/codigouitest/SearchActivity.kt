package com.example.codigouitest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        findViewById<Button>(R.id.btnFilter).setOnClickListener {
            startActivity(Intent(this, DetailActivity::class.java))
        }
        findViewById<RecyclerView>(R.id.rcvCars).apply {
            adapter = CarAdapter(arrayListOf("Toyota", "Mazda", "Honda", "Suzuki", "Chevrolet"))
        }
    }
}