package com.grepp.coffeemanager.domain.sale;

import com.grepp.coffeemanager.domain.order.Order;
import com.grepp.coffeemanager.domain.payment.Payment;

public class Sale {

    public Payment takeOrder(Order order) {
        //주문
        order.proceed();

        //결제
        Payment payment = new Payment(order);
        payment.proceed();
        return payment;
    }
}
