package com.livestream.navdrawer

import android.os.Bundle

import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.layoutManager=LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        val numberList = ArrayList<Number>()
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        numberList.add(Number("one","odd"))
        val adapter = CustomAdapter(numberList)
        recycler_view.adapter =adapter



    }
}
