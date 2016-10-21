package com.springframework.ecommerce.repositories;

import com.springframework.ecommerce.domain.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by steven on 10/20/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
