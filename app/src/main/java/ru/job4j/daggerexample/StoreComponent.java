package ru.job4j.daggerexample;

import dagger.Component;

@Component(modules = StoreModule.class)
public interface StoreComponent {
    void injectTo(MainActivity activity);
}