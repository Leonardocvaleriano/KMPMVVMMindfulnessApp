package data.network

import io.ktor.client.request.get

class MindfulnessBooksService:KtorApi() {

    suspend fun getAllMindfulnessBooks() = httpClient.get {

    }


}