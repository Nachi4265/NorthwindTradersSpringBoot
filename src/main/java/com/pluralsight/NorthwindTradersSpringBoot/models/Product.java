package com.pluralsight.NorthwindTradersSpringBoot.models;

public class Product {

    private int productID;
    private String name;
    private String category;
    private double price;


    public Product(double price, String category, String name, int productID) {
        this.price = price;
        this.category = category;
        this.name = name;
        this.productID = productID;
    }

    public Product() {

    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
