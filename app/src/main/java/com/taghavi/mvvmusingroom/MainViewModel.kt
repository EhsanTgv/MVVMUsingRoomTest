package com.taghavi.mvvmusingroom

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData


class MainViewModel(application: Application?) : AndroidViewModel(application!!) {
    val tasks: LiveData<List<TaskEntry?>?>?
    private val tasksRepository: TasksRepository
    fun deleteTask(taskEntry: TaskEntry?) {
        tasksRepository.deleteTasks(taskEntry)
    }

    companion object {
        // Constant for logging
        private val TAG = MainViewModel::class.java.simpleName
    }

    init {
        val database = AppDatabase.getInstance(getApplication())
        Log.d(TAG, "Actively retrieving the tasks from the DataBase")
        //tasks = database.taskDao().loadAllTasks();
        tasksRepository = TasksRepository(database!!)
        tasks = tasksRepository.getloadAllTasks()
    }
}