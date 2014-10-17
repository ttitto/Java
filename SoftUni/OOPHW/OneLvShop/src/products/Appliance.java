package products;

import onelvshop.AgeRestriction;

public class Appliance extends ElectronicsProduct {

    private final int criticalQuantity = 50;

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction, int guaranteePeriod) {
        super(name, price, quantity, ageRestriction, 6);
    }

    @Override
    public double getPrice() {
        if (this.getQuantity() < criticalQuantity) {
            return 1.05 * this.price;
        } else {
            return this.price;
        }
    }
}
