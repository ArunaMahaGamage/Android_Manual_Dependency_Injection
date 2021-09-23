package com.aruna.manualdependencyinjection.factory;

// Definition of a Factory interface with a function to create objects of a type
public interface Factory<T> {
    T create();
}
