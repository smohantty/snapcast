// Generated by Dagger (https://dagger.dev).
package com.samsung.snapcast.mcf.fake;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class FakeMcfDataSource_Factory implements Factory<FakeMcfDataSource> {
  @Override
  public FakeMcfDataSource get() {
    return newInstance();
  }

  public static FakeMcfDataSource_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FakeMcfDataSource newInstance() {
    return new FakeMcfDataSource();
  }

  private static final class InstanceHolder {
    private static final FakeMcfDataSource_Factory INSTANCE = new FakeMcfDataSource_Factory();
  }
}
