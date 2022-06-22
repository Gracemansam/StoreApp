package model;

public class Product {
    private String name;
    private int quantity;
    private float Price;

    public Product(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
