package com.akshay.viewmodeldemo

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterViewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)

        count.text = counterViewModel.counter.toString()

        // Incrementing the count
        increment.setOnClickListener {
            counterViewModel.counter++
            count.text = counterViewModel.counter.toString()
        }
    }
}
