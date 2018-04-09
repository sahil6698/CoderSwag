package com.example.sahil.coderswag.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.sahil.coderswag.Adapters.CategoryAdapter
import com.example.sahil.coderswag.Model.Product
import com.example.sahil.coderswag.R
import com.example.sahil.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list_view_arrayadapter.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter:CategoryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter= CategoryAdapter(this,DataService.categories)
        categoryListView.adapter=adapter
    }
}
