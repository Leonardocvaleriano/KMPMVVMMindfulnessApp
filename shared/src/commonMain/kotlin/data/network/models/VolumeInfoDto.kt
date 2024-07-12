package data.network.models


import domain.models.VolumeInfo
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VolumeInfoDto(
    @SerialName("imageLinks")
    val imageLinksDto: ImageLinksDto?,
    @SerialName("subtitle")
    val subtitleDto: String?,
    @SerialName("title")
    val titleDto: String?
)