package com.taghavi.mvvmusingroom

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        viewModel.tasks!!.observe(this, { taskEntries ->
//            Log.d(TAG, "Updating list of tasks from LiveData in ViewModel")
//            mAdapter.setTasks(taskEntries)
//            mAdapter.notifyDataSetChanged() //optional statement. will work the same without also
        })
    }
}