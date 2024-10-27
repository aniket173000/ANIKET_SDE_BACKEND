package org.example.systemDesign.Ecommerce;

import java.util.Map;

public class Order {
    private final String orderId;
    private final Map<String, Integer> productMap;
    private boolean isConfirmed;

    public Order(String orderId, Map<String, Integer> orderMap){
        this.orderId = orderId;
        this.productMap = orderMap;
        this.isConfirmed = false;
    }

    public String getOrderId() {
        return orderId;
    }

    public Map<String, Integer> getProductMap() {
        return productMap;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }

    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }
}
