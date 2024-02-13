package com.samsung.snapcast.mcf.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/samsung/snapcast/mcf/di/FlavorMcfModule;", "", "bindNetworkMcfDataSource", "Lcom/samsung/snapcast/mcf/McfDataSource;", "dataSource", "Lcom/samsung/snapcast/mcf/network/NetworkMcfDataSource;", "mcf_prodRelease"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public abstract interface FlavorMcfModule {
    
    @dagger.Binds()
    @org.jetbrains.annotations.NotNull()
    public abstract com.samsung.snapcast.mcf.McfDataSource bindNetworkMcfDataSource(@org.jetbrains.annotations.NotNull()
    com.samsung.snapcast.mcf.network.NetworkMcfDataSource dataSource);
}