package data.utils

import data.network.models.ImageLinksDto
import data.network.models.VolumeInfoDto
import domain.models.ImageLinks
import domain.models.VolumeInfo

fun VolumeInfoDto.toDomain(): VolumeInfo {
    return VolumeInfo(
        title = this.titleDto,
        imageLinks = convertImageLinksDtoToImageLinksDomain(imageLinksDto = this.imageLinksDto),
        subtitle = this.subtitleDto
    )
}

fun convertImageLinksDtoToImageLinksDomain(imageLinksDto: ImageLinksDto?):ImageLinks {
    return ImageLinks(
        thumbnail = imageLinksDto!!.smallThumbnailDto,
        smallThumbnail = imageLinksDto.smallThumbnailDto)
}


