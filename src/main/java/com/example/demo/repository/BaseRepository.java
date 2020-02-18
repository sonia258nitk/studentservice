package com.example.demo.repository;

import java.util.List;

public interface BaseRepository<T> {

    List<T> findAll();

    List<T> findTop();

    T save(T t);
}
