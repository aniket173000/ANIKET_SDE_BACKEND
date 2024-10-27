package org.example.systemDesign.Ecommerce;

import java.util.HashMap;
import java.util.Map;

public class OrderService {
    private InventoryProduct inventoryProduct;
    private final Map<String, Order> orderMap = new HashMap<>();
    public OrderService(InventoryProduct inventoryProduct){
        this.inventoryProduct = inventoryProduct;
    }
    public String createOrder(Map<String, Integer> productMap) throws Exception {
        Order order = OrderFactory.createOrder(productMap);
        for(Map.Entry<String, Integer> entry : productMap.entrySet()){
            inventoryProduct.blockInventory(entry.getKey(), entry.getValue());
        }
        orderMap.put(order.getOrderId(), order);
        return order.getOrderId();
    }

    public void confirmOrder(String orderId) throws Exception {
        Order order = orderMap.get(orderId);
        if(order!=null){
            if(order.isConfirmed())
            {
                throw new Exception("Order is already confirmed");
            }
            for(Map.Entry<String, Integer> entry : order.getProductMap().entrySet()){
                inventoryProduct.confirmProduct(entry.getKey(), entry.getValue());
            }
            order.setConfirmed(true);
        }else{
            throw new Exception("Order not found");
        }


    }

    public void cancelOrder(String orderId) throws Exception {
        Order order = orderMap.get(orderId);
        if(order!=null){
            for(Map.Entry<String, Integer> entry : order.getProductMap().entrySet()){
                inventoryProduct.revertProductBlock(entry.getKey(), entry.getValue());
            }
            orderMap.remove(orderId);
        }else{
            throw new Exception("Order not found");
        }
    }

    public Order getOrder(String orderId) throws Exception {
        Order order = orderMap.get(orderId);
        if (order != null) {
            return order;
        } else {
            throw new Exception("Order not found");
        }
    }
}
