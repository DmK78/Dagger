package ru.job4j.daggerexample;

import java.util.List;

public interface Store {
    void add(String value);
    List<String> getAll();
}