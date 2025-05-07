package com.my.ordersystem.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class CreateOrder {
    private final int customerId;
    private final Map<Integer, Integer> quantityByProduct;
}