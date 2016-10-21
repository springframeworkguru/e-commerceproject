package com.springframework.ecommerce.domain;

import javax.persistence.*;

/**
 * Created by steven on 10/20/16.
 */
@MappedSuperclass
public class AbstractDomainClass implements DomainObject{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}
