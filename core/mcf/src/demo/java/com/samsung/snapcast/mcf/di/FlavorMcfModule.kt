package com.samsung.snapcast.mcf.di


import com.samsung.snapcast.mcf.McfDataSource
import com.samsung.snapcast.mcf.fake.FakeMcfDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface FlavorMcfModule {

    @Binds
    fun bindFakeMcfDataSource(dataSource: FakeMcfDataSource): McfDataSource
}