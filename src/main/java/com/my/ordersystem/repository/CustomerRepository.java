package com.my.ordersystem.repository;

import com.my.ordersystem.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}
