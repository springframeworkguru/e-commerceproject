package com.springframework.ecommerce.services;

import java.util.List;

/**
 * Created by steven on 10/20/16.
 */
public interface CRUDService<T> {

    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}
