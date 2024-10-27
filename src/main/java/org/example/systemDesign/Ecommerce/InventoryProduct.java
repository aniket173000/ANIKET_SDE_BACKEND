package org.example.systemDesign.Ecommerce;

import java.util.HashMap;
import java.util.Map;

public class InventoryProduct {
    private Map<String, Product> productsMap = new HashMap<>();

    public void addProduct(String productId, Integer quantityAvailable){
        Product product = new Product(productId, quantityAvailable);
        System.out.println("Product added successfully with id " + productId);
        productsMap.put(productId, product);
    }

    public Product getProduct(String productId){
        if(productsMap.containsKey(productId)){
            return productsMap.get(productId);
        }
        throw new IllegalArgumentException("Product not found");
    }

    public void blockInventory(String productId, Integer quantity) throws Exception {
        Product product = productsMap.get(productId);
        if(product!=null){
            product.blockProductQuantity(quantity);
        }else{
            throw new Exception("Product not found");
        }

    }

    public void revertProductBlock(String productId, Integer quantity) throws Exception {
        Product product = productsMap.get(productId);
        if(product!=null){
            product.revertProductQuantity(quantity);
        }
        throw new Exception("Product not found");
    }

    public void confirmProduct(String productId, Integer quantity) throws Exception {
        Product product = productsMap.get(productId);
        if (product != null) {
            product.confirmProductQuantity(quantity);
        }else{
            throw new Exception("Product not found");
        }

    }

    public void addMoreQuantity(String productId, Integer quantity) throws Exception {
        Product product = productsMap.get(productId);
        if (product != null) {
            product.addProductQuantity(quantity);
        }
        throw new Exception("Product not found");
    }

    public Integer getProductQuantity(String productId) throws Exception {
        Product product = productsMap.get(productId);
        if (product != null) {
            return product.getStock();
        }
        throw new Exception("Product not found");
    }
}
