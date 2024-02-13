package com.samsung.snapcast.mcf.network

import com.samsung.snapcast.mcf.McfDataSource
import javax.inject.Inject

/**
 * [McfDataSource] implementation that provides fake mcf service
 */
internal class NetworkMcfDataSource @Inject constructor(
) : McfDataSource {
    override fun test():String {
        return "RealData"
    }
}