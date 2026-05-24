package com.example.smarttodolist.data.data

import com.example.smarttodolist.data.model.TaskAction
import com.google.mlkit.nl.entityextraction.EntityExtraction
import com.google.mlkit.nl.entityextraction.EntityExtractor
import com.google.mlkit.nl.entityextraction.EntityExtractorOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class InsightRepository {

    private val entityExtractor: EntityExtractor by lazy {
        val options = EntityExtractorOptions.Builder(
            EntityExtractorOptions.ENGLISH
        ).build()

        EntityExtraction.getClient(options)
    }

    suspend fun analyzeTask(text: String): List<TaskAction> = withContext(Dispatchers.IO){
        emptyList<TaskAction>()
    }

    fun close(){
        entityExtractor.close()
    }
}