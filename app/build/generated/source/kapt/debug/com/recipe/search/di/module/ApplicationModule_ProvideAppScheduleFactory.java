package com.recipe.search.di.module;

import com.recipe.search.rx.AppSchedulerProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationModule_ProvideAppScheduleFactory
    implements Factory<AppSchedulerProvider> {
  private final ApplicationModule module;

  public ApplicationModule_ProvideAppScheduleFactory(ApplicationModule module) {
    this.module = module;
  }

  @Override
  public AppSchedulerProvider get() {
    return proxyProvideAppSchedule(module);
  }

  public static ApplicationModule_ProvideAppScheduleFactory create(ApplicationModule module) {
    return new ApplicationModule_ProvideAppScheduleFactory(module);
  }

  public static AppSchedulerProvider proxyProvideAppSchedule(ApplicationModule instance) {
    return Preconditions.checkNotNull(
        instance.provideAppSchedule(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
