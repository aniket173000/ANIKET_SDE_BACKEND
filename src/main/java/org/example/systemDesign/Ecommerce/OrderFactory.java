package org.example.systemDesign.Ecommerce;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class OrderFactory {

    public static Order createOrder(Map<String , Integer> productMap){
        String orderId = UUID.randomUUID().toString();
        return new Order(orderId, productMap);
    }

}
