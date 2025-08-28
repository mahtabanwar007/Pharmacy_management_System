package model;

public class Medicine {
    private int id;
    private String name;
    private int quantity;
    private double price;

    public Medicine(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Qty: " + quantity + ", Price: ₹" + price;
    }
}