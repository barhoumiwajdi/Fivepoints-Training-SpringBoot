package com.example.jpatraining.dao;

import com.example.jpatraining.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {


    @Override
    List<Customer> findAll();
}
