package com.my.ordersystem.service;

import com.my.ordersystem.domain.CreateCustomer;
import com.my.ordersystem.domain.Customer;
import com.my.ordersystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public Customer newCustomer(CreateCustomer customer) {
        Customer entity = Customer.newCustomer(customer);
        return customerRepository.save(entity);
    }
}
