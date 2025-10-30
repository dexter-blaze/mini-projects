package com.dexterBlaze.website.repository;

import java.util.Optional;

public interface DAO<T> {
    /* Two functionalities
    1. getting our data/object
    2. saving an object/data
     */
    Optional<T> get(Integer id);
    int save(T t);
}
