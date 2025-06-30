package com.food.ordering.system.domain.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public abstract class BaseEntity<Id> {
    private Id id;
}
