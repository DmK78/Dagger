package ru.job4j.daggerexample;

import android.app.Application;

public class App extends Application {
    private static StoreComponent stores;

    @Override
    public void onCreate() {
        super.onCreate();
        stores = DaggerStoreComponent.create();
    }

    public static StoreComponent getStore() {
        return stores;
    }
}