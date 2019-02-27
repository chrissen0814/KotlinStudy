package com.chrissen.kotlinstudy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val person = listOf(Person("Alice"), Person("Bob", age = 20))
        val oldest = person.maxBy { it.age ?: 0 }
        Log.i("TAG", "The oldest is $oldest")
    }
}
