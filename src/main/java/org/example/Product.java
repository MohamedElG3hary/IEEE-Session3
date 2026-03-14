package org.example;

public class Product {

    private int price;
    private boolean inStock;
    private String productName;

    public Product() {
        this.price =0;
        this.inStock = false;
        this.productName = "_";
    }

    public Product(int price, boolean inStock , String productName) {
        this.price = price;
        this.inStock = inStock;
        this.productName = productName;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getPrice() {
        return price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public String getProductName() {
        return productName;
    }
}
