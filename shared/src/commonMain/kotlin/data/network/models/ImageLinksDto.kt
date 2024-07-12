package data.network.models


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageLinksDto(
    @SerialName("smallThumbnail")
    val smallThumbnailDto: String?,
    @SerialName("thumbnail")
    val thumbnailDto: String?
)