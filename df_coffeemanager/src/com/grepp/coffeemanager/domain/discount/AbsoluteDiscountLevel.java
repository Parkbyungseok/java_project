package com.grepp.coffeemanager.domain.discount;

import com.grepp.coffeemanager.domain.order.Order;
import java.time.LocalTime;

public enum AbsoluteDiscountLevel {
    LEVEL1(LocalTime.of(10,0),LocalTime.of(11,0),100),
    LEVEL2(LocalTime.of(21,0),LocalTime.of(23,0),200);

    AbsoluteDiscountLevel(LocalTime from, LocalTime to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    private LocalTime from;
    private LocalTime to;
    private final int amount;


    public boolean checkRange(Order order){
        LocalTime orderTime = order.getOrderTime().toLocalTime();
        return from.isBefore(orderTime) && to.isAfter(orderTime);
    }

    public int amount(){
        return amount;
    }
}
