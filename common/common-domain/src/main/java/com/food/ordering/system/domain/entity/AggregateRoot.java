package com.food.ordering.system.domain.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class AggregateRoot<Id> extends BaseEntity<Id> {
    public AggregateRoot(Id id) {
        super(id);
    }
}
