package data.network

import data.network.models.VolumeInfoDto
import io.ktor.client.call.body
import io.ktor.client.request.get

class MindfulnessBooksService : KtorApi() {

        suspend fun getAllMindfulnessBooks(
        ): List<VolumeInfoDto> = client.get {
            pathUrl("books/v1/volumes?q=mindfulness")
        }.body()

}