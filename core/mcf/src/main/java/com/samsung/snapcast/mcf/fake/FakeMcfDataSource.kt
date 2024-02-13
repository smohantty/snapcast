
package com.samsung.snapcast.mcf.fake

import com.samsung.snapcast.mcf.McfDataSource
import javax.inject.Inject

/**
 * [McfDataSource] implementation that provides fake mcf service
 */
class FakeMcfDataSource @Inject constructor(
) : McfDataSource {
    override fun test():String {
        return "FakeData"
    }
}