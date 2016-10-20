package com.springframework.ecommerce.services;

import com.springframework.ecommerce.domain.Customer;

import java.util.List;

/**
 * Created by steven on 10/19/16.
 */
public interface CustomerService {

    List<Customer> listAllCustomers();

    Customer getCustomerById(Integer id);

    Customer saveOrUpdateCustomer(Customer customer);

    public void deleteCustomer(Integer id);
}
