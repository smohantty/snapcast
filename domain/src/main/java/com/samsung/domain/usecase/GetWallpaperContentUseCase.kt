package com.samsung.snapcast.domain.usecase

import com.samsung.snapcast.domain.model.ImageData
import com.samsung.snapcast.domain.repository.WallpaperRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetWallpaperContentUseCase @Inject constructor(
    private val wallpaperRepository: WallpaperRepository
) {

    operator fun invoke(): Flow<List<ImageData>> {
        return flowOf(wallpaperRepository.getWallpaperData())
    }

}