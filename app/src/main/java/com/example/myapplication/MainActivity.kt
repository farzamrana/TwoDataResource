package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.myapplication.Model.Category.Categories
import com.example.myapplication.Services.DataSource
import com.example.myapplication.Model.Category.Modeltwo
import com.example.myapplication.Services.DataSorcetwo

class MainActivity : AppCompatActivity() {

    lateinit var adapter:ArrayAdapter<Categories>
    lateinit var adapter2: ArrayAdapter<Modeltwo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var data =DataSource()
        var data2 =DataSorcetwo()
        adapter=ArrayAdapter(this,android.R.layout.simple_list_item_1,data.Categories)
        adapter2=ArrayAdapter(this,android.R.layout.simple_list_item_1,data2.Modeltwo)
        val listone = findViewById <ListView> (R.id.listone)
        val listwo = findViewById <ListView> (R.id.listtwo)
        listone.adapter=adapter
        listwo.adapter=adapter2
    }
}