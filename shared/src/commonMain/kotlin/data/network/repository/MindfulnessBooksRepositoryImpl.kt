package data.network.repository

import data.network.MindfulnessBooksService
import data.utils.toDomain
import domain.models.VolumeInfo
import domain.repository.MindfulnessBooksRepository

class MindfulnessBooksRepositoryImpl(
    private val mindfulnessBooksService: MindfulnessBooksService,
):MindfulnessBooksRepository {
    override suspend fun getAllMindfulnessBooks(): List<VolumeInfo> {
        return mindfulnessBooksService.getAllMindfulnessBooks().map { it.toDomain() }
    }
}
