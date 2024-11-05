package com.example.plantdesease.presentation.home

import CustomListViewAdapter
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.plantdesease.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        val dataList = listOf(
            DataModel(R.drawable.plant_one, "Plant 1", "Healthy plant with vibrant leaves", "2 Hours Ago"),
            DataModel(R.drawable.plant_two, "Plant 2", "Some signs of pest damage", "3 Hours Ago"),
            DataModel(R.drawable.plant_three, "Plant 3", "Healthy plant with vibrant leaves", "5 Hours Ago"),
            DataModel(R.drawable.plant_four, "Plant 4", "Some signs of pest damage", "8 Hours Ago"),
            DataModel(R.drawable.plant_five, "Plant 5", "Healthy plant with vibrant leaves", "9 Hours Ago")
        )

        // Temukan ListView dan set adapter
        val listView: ListView = findViewById(R.id.listView)
        val adapter = CustomListViewAdapter(this, R.layout.activity_costum_list_view, dataList)
        listView.adapter = adapter
    }
}