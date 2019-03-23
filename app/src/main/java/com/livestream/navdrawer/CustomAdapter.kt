package com.livestream.navdrawer

import android.support.v7.widget.AppCompatAutoCompleteTextView
import android.support.v7.widget.AppCompatTextView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class  CustomAdapter(val numberlist: ArrayList<Number>):RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    //REturning the view for each row in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return ViewHolder(v)


        //Binding the data to the list

    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(numberlist[position])

    }

    override fun getItemCount(): Int {
        return numberlist.size

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItems(number:Number) {

            val textNumber =
                itemView.findViewById<AppCompatTextView>(R.id.text_view1) as AppCompatTextView
            val textAttribute =
                itemView.findViewById<AppCompatTextView>(R.id.text_view2) as AppCompatTextView
            textNumber.text = number.number
            textAttribute.text =number.attribute

        }
    }
}