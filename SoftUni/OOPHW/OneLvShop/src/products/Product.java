package products;

import interfaces.Buyable;
import java.security.InvalidParameterException;
import onelvshop.AgeRestriction;

public abstract class Product implements Buyable {

    private String name;
    protected double price;
    private int quantity;
    private AgeRestriction ageRestriction;

    public Product(String name, double price, int quantity, AgeRestriction ageRestriction) {
        this.setAgeRestriction(ageRestriction);
        this.setName(name);
        this.setPrice(price);
        this.setQuantity(quantity);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name == "" || " " == name) {
            throw new InvalidParameterException("Name can not be null or empty!");
        }

        this.name = name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new InvalidParameterException("Product price can not be negative!");
        }

        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new InvalidParameterException("Product quantity can not be negative!");
        }

        this.quantity = quantity;
    }

    public AgeRestriction getAgeRestriction() {
        return this.ageRestriction;
    }

    public void setAgeRestriction(AgeRestriction ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return String.format("%s: price: %.2f, quantity: %d", this.getName(), this.getPrice(), this.getQuantity());
    }
}
