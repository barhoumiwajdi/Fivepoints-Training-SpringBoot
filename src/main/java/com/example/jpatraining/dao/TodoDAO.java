package com.example.jpatraining.dao;

import com.example.jpatraining.model.Customer;
import com.example.jpatraining.model.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoDAO extends CrudRepository<Todo , Integer> {

    @Override
    List<Todo> findAll();
}
