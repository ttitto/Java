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

    @Override
    public double getPrice() {
        Date now = Date.from(Instant.now());
        long expire = now.getTime() + 1000 * 60 * 60 * 24 * 15;

        if (this.getExpirationDate().getTime() <= expire) {
            return 0.7 * this.price;
        } else {
            return this.price;
        }
    }

    @Override
    public Date getExpirationDate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

}
