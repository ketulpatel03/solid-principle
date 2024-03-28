package com.java.InterfaceSegregationPrinciple;

// design interfaces in such a way that the classes that implement those interfaces
// does not have many unused functions

// In short, don't make an interface as a "FAT INTERFACE"
public interface Store {

    void save();

    void update();

    void delete();

    void get();

}
