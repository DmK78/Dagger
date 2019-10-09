package ru.job4j.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StoreModule {
    @Singleton
    @Provides
    public Store providesStore() {
        return new MemStore();
    }
}