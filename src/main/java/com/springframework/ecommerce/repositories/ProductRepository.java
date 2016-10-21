package com.springframework.ecommerce.repositories;

import com.springframework.ecommerce.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by steven on 10/20/16.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
