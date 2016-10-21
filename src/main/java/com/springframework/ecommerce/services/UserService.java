package com.springframework.ecommerce.services;

import com.springframework.ecommerce.domain.User;

/**
 * Created by steven on 10/20/16.
 */
public interface UserService extends CRUDService<User> {

    User findByUserName(String userName);
}
