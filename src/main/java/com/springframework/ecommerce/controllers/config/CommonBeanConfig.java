package com.springframework.ecommerce.controllers.config;

import org.springframework.context.annotation.Bean;
import org.jasypt.util.password.StrongPasswordEncryptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by steven on 10/20/16.
 */
@Configuration
@EnableJpaRepositories("com.springframework.ecommerce.repositories")
public class CommonBeanConfig {

    @Bean
    public StrongPasswordEncryptor strongEcryptor() {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        return encryptor;
    }
}
