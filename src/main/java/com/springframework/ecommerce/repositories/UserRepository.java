package com.springframework.ecommerce.repositories;

import com.springframework.ecommerce.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by steven on 10/20/16.
 */
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUserName(String userName);
}
