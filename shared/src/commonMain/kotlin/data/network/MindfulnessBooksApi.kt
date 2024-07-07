package ktor

import domain.models.MindfulnessBooksResult

interface MindfulnessBooksApi {
    suspend fun getJsonFromApi(): MindfulnessBooksResult

}