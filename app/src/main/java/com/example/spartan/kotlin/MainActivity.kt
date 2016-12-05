package com.example.spartan.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {


    private var list= ArrayList<Int>()
    private val intArray = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.addAll(Arrays.asList(*intArray))
        defaultValue.setText(list.toString())

        evenButton.setOnClickListener {evenList(list)}
        oddButton.setOnClickListener { oddList(list) }
        multiplyButton.setOnClickListener { multiplyBy2(list) }

    }


    private fun evenList(list: ArrayList<Int>) {
        updatedValue.setText(list.filter { i -> i%2==0 }.toString())
    }

    private fun oddList(list: ArrayList<Int>) {
        updatedValue.setText(list.filter { i -> i%2!=0 }.toString())
    }

    private fun multiplyBy2(list: ArrayList<Int>){
        updatedValue.setText(list.map{ i -> i*2 }.toString())
    }

}

