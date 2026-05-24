package com.example.smarttodolist.data.model

data class TaskAction(
    val start: Int,
    val end: Int,
    val value: String,
    val type: TaskActionType
)
