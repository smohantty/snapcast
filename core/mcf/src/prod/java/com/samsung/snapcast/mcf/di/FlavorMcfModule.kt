package com.samsung.snapcast.mcf.di


import com.samsung.snapcast.mcf.McfDataSource
import com.samsung.snapcast.mcf.network.NetworkMcfDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal interface FlavorMcfModule {

    @Binds
    fun bindNetworkMcfDataSource(dataSource: NetworkMcfDataSource): McfDataSource
}