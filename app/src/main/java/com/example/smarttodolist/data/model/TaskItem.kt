package com.example.smarttodolist.data.model

data class TaskItem(
    val text: String,
    val actions: List<TaskAction> = emptyList()
)
