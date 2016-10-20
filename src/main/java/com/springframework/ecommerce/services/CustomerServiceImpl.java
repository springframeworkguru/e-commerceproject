package com.springframework.ecommerce.services;

import com.springframework.ecommerce.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by steven on 10/19/16.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<Integer, Customer> customers;

    public CustomerServiceImpl() {
        loadCustomers();
    }

    @Override
    public List<Customer> listAllCustomers() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public Customer getCustomerById(Integer id) {
        return customers.get(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer customer) {
        if(customer != null) {
            if(customer.getId() == null) {
                customer.setId(getNextKey());
            }

            return customers.put(customer.getId(), customer);
        }
        return customer;
    }

    @Override
    public void deleteCustomer(Integer id) {
        customers.remove(id);
    }

    private Integer getNextKey() {
        return Collections.max(customers.keySet()) + 1;
    }

    public void loadCustomers() {
        customers = new HashMap<>();

        Customer customer1 = new Customer();

    }

}
