package com.food.ordering.system.domain.entity;

import java.io.Serializable;

public abstract class BaseEntity<Id extends Serializable> implements Serializable {
    private Id id;


}
