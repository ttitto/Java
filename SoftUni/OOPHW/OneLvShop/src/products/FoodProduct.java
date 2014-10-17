package products;

import interfaces.Expirable;
import java.time.Instant;
import java.util.Date;
import onelvshop.AgeRestriction;

public class FoodProduct extends Product implements Expirable {

    private Date expirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, Date expirationDate) {
        super(name, price, quantity, ageRestriction);
        this.setExpirationDate(expirationDate);
    }

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
        this.setExpirationDate(null);
    }

    @Override
    public double getPrice() {
        Date now = Date.from(Instant.now());
        long expire = now.getTime() + 1000 * 60 * 60 * 24 * 15;

        if (this.getExpirationDate() == null || this.getExpirationDate().getTime() <= expire) {
            return 0.7 * this.price;
        } else {
            return this.price;
        }
    }

    @Override
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString(){
        return super.toString() + String.format(", expires on: %s", this.getExpirationDate());
    }
}
