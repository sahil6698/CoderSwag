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
            val holder:ViewHolder

        if(convertView==null){
            categoryView= LayoutInflater.from(context).inflate(R.layout.list_view_category,null)
            holder=ViewHolder()
            holder.categoryImage=categoryView.findViewById(R.id.categoryImage)
            holder.categoryName=categoryView.findViewById(R.id.categoryText)
            categoryView.tag=holder
        }else{
            holder=convertView.tag as ViewHolder
            categoryView=convertView
            categoryView.tag=holder
        }

        println("Heavy Computing")
        val category=categories[position]
        val resourceId=context.resources.getIdentifier(category.image,"drawable",context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        print("\t"+resourceId)
        holder.categoryName?.text=category.title
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
    class ViewHolder(){
        var categoryName:TextView?= null
        var categoryImage:ImageView?=null
    }
}