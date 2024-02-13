package com.samsung.snapcast.domain.repository

import com.samsung.snapcast.domain.model.ImageData

interface WallpaperRepository {
    fun getWallpaperData(): List<ImageData>

    fun getDetailWallpaper(id: Int): ImageData
}