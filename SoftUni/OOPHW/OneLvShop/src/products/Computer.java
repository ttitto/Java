package products;

import onelvshop.AgeRestriction;

public class Computer extends ElectronicsProduct {

    private final int reductionQuantity = 1000;

    public Computer(
            String name,
            double price,
            int quantity,
            AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, 24);
    }

    @Override
    public double getPrice() {
        if (this.getQuantity() > reductionQuantity) {
            return 0.95 * this.price;
        } else {
            return this.price;
        }
    }
}
