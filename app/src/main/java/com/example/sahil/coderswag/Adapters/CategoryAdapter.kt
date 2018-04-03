package com.example.sahil.coderswag.Adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.sahil.coderswag.Model.Category
import com.example.sahil.coderswag.R
import kotlinx.android.synthetic.main.activity_main.*

class CategoryAdapter(context:Context,categories:List<Category>):BaseAdapter() {

        val context=context
        val categories=categories

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val categoryView:View
            categoryView=LayoutInflater.from(context).inflate(R.layout.list_view_category,null)
            val categoryImage:ImageView=categoryView.findViewById(R.id.categoryImage)
            val categoryText:TextView=categoryView.findViewById(R.id.categoryText)

        val category=categories[position]

        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryImage.setImageResource(resourceId)
        println(resourceId)

        categoryText.text=category.title



        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()}
}