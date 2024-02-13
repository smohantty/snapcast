package com.samsung.snapcast.domain.usecase

import com.samsung.snapcast.domain.model.ImageData
import com.samsung.snapcast.domain.repository.WallpaperRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetWallpaperDetailUseCase @Inject constructor(
    private val wallpaperRepository: @JvmSuppressWildcards WallpaperRepository
) {
    operator fun invoke(id: Int): Flow<ImageData> {
        return flowOf(wallpaperRepository.getDetailWallpaper(id))
    }


}