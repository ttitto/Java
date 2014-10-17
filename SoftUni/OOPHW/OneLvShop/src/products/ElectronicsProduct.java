package products;

import java.security.InvalidParameterException;
import onelvshop.AgeRestriction;

public abstract class ElectronicsProduct extends Product {

    private int guaranteePeriod;

    public ElectronicsProduct(
            String name,
            double price,
            int quantity,
            AgeRestriction ageRestriction,
            int guaranteePeriod) {
        super(name, price, quantity, ageRestriction);

        this.setGuaranteePeriod(guaranteePeriod);
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        if (guaranteePeriod < 0) {
            throw new InvalidParameterException("Guarantee period can not be negative!");
        }

        this.guaranteePeriod = guaranteePeriod;
    }
}
