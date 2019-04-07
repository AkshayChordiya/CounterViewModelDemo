package com.akshay.viewmodeldemo

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterViewModel = ViewModelProviders.of(this).get(CounterViewModel::class.java)

        counterViewModel.counter.observe(this, Observer { num ->
            count.text = num.toString()
        })

        // Incrementing the count
        increment.setOnClickListener {
            counterViewModel.increment()
        }
    }
}
