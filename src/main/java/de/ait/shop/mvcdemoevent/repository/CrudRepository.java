package de.ait.shop.mvcdemoevent.repository;

import java.util.List;


public interface CrudRepository<T> {
    void save(T model);

    void delete(T model);

    void update(T model);

    List<T> findAll();

}

