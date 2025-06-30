package com.food.ordering.system.domain.order.service.domain.entity;

import com.food.ordering.system.domain.entity.BaseEntity;
import com.food.ordering.system.domain.valueobject.Money;
import com.food.ordering.system.domain.valueobject.ProductId;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money price;

    public Product(ProductId id, String name, Money price) {
        super(id);
        this.name = name;
        this.price = price;
    }
}
