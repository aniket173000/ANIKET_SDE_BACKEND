package org.example.systemDesign.Ecommerce;

public class Product {
    private final String productId;
    private Integer quantityAvailable;
    private Integer quantityInOrder;

    public Product(String productId, Integer quantityAvailable){
        this.productId = productId;
        this.quantityAvailable = quantityAvailable;
        this.quantityInOrder = 0;
    }

    public void blockProductQuantity(Integer quantity) throws Exception {
        if(quantity > this.quantityAvailable){
            throw new Exception("Quantity requested is more than available");
        }
        this.quantityAvailable -= quantity;
        this.quantityInOrder += quantity;
    }
    public void revertProductQuantity(Integer quantity){
        this.quantityAvailable += quantity;
        this.quantityInOrder -= quantity;
    }

    public void confirmProductQuantity(Integer quantity){
        this.quantityInOrder -= quantity;
    }

    public void addProductQuantity(Integer quantity){
        this.quantityAvailable += quantity;
    }

    public Integer getStock(){
        return this.quantityAvailable;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Integer getQuantityInOrder() {
        return quantityInOrder;
    }

    public void setQuantityInOrder(Integer quantityInOrder) {
        this.quantityInOrder = quantityInOrder;
    }
}
