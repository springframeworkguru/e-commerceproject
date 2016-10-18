package com.springframework.ecommerce.services;

import com.springframework.ecommerce.domain.Product;

import java.util.List;

/**
 * Created by steven on 10/18/16.
 */
public interface ProductService {

    List<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveOrUpdateProduct(Product product);

    void deleteProduct(Integer id);
}
