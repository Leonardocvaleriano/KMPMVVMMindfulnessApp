package domain.repository

import domain.models.VolumeInfo

interface MindfulnessBooksRepository {
    suspend fun getAllMindfulnessBooks():List<VolumeInfo>
}