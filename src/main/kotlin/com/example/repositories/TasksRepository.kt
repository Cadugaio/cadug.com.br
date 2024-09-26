package com.example.repositories

import com.example.models.Task

class TasksRepository {

    val tasks get() = _tasks.toList()

    fun save(task: Task){
        _tasks.add(task)
    }

    companion object{
        private val _tasks = mutableListOf<Task>()
    }


}