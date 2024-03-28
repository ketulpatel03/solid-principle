package com.java.DependencyInversionPrinciple;

public interface CacheStore {

    void addKey();

    void removeKey();

    void evictKey();

}
