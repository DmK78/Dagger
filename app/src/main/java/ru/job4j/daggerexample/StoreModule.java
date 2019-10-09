package ru.job4j.daggerexample;

import dagger.Module;
import dagger.Provides;

@Module
public class StoreModule {
    @Provides
    public Store providesStore() {
        return new MemStore();
    }
}