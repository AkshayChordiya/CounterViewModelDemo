package com.akshay.viewmodeldemo

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun increment() {
        counter.value = counter.value?.inc()
    }
}