package org.example.systemDesign.Ecommerce;

import java.util.HashMap;
import java.util.Map;

public class EcommerceMain {
    public static void main(String[] args) {
        System.out.println("Hey we are ready for Ecommerce challenge");
        InventoryProduct inventoryProduct = new InventoryProduct();
        inventoryProduct.addProduct("1", 10);
        inventoryProduct.addProduct("2", 23);
        inventoryProduct.addProduct("3", 30);
        OrderService orderService = new OrderService(inventoryProduct);
        Map<String, Integer> productMap = new HashMap<>();
        productMap.put("1", 1);
        productMap.put("2", 25);
        String orderId = "1";
        try{
            orderId = orderService.createOrder(productMap);
            System.out.println("Order created successfully");
        } catch(Exception e){
            System.out.println("Exception occurred while creating order: " + e.getMessage());
        }
        try{
            Integer remQuantity1 = inventoryProduct.getProductQuantity("1");
            Integer remQuantity2 = inventoryProduct.getProductQuantity("2");
            Integer remQuantity3 = inventoryProduct.getProductQuantity("3");
            System.out.println("Remaining quantity of product 1 is " + remQuantity1);
            System.out.println("Remaining quantity of product 2 is " + remQuantity2);
            System.out.println("Remaining quantity of product 3 is " + remQuantity3);
        }catch (Exception e){
            System.out.println("Exception occurred while fetching remaining quantity: " + e.getMessage());
        }
        try{
            orderService.confirmOrder(orderId);
            System.out.println("Order confirmed successfully");
        }catch (Exception e){
            System.out.println("Exception occurred while confirming order: " + e.getMessage());
        }
        try{
            Integer remQuantity1 = inventoryProduct.getProductQuantity("1");
            Integer remQuantity2 = inventoryProduct.getProductQuantity("2");
            Integer remQuantity3 = inventoryProduct.getProductQuantity("3");
            System.out.println("Remaining quantity of product 1 is " + remQuantity1);
            System.out.println("Remaining quantity of product 2 is " + remQuantity2);
            System.out.println("Remaining quantity of product 3 is " + remQuantity3);
        }catch (Exception e){
            System.out.println("Exception occurred while fetching remaining quantity" + e.getMessage());
        }


    }
}
