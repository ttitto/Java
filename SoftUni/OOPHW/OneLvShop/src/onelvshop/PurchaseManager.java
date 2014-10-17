package onelvshop;

import CustomExceptions.OutOfStockException;
import CustomExceptions.PaymentAmountException;
import CustomExceptions.ProductExpiredException;
import CustomExceptions.PurchasePermissionDeniedException;
import interfaces.Expirable;
import java.util.Date;
import products.Product;

public final class PurchaseManager {

    private PurchaseManager() {
    }

    public static void processPurchase(Customer customer, Product product) {
        if (product.getQuantity() < 1) {
            throw new OutOfStockException("This product is out of stock!");
        }

        if (product instanceof Expirable) {
            Date expDate = ((Expirable) product).getExpirationDate();
            if (expDate != null) {
                Date now = new Date();
                if (expDate.before(now)) {
                    throw new ProductExpiredException("Product has expired!");
                }
            }
        }

        if (customer.getBalance() < product.getPrice()) {
            throw new PaymentAmountException("You do not have enough money to buy this product!");
        }

        if ((product.getAgeRestriction() == AgeRestriction.Teenager && customer.getAge() < 13)
                || (product.getAgeRestriction() == AgeRestriction.Adult && customer.getAge() < 18)) {
            throw new PurchasePermissionDeniedException("You are too young to buy this product!");
        }

        customer.setBalance(customer.getBalance() - product.getPrice());
        product.setQuantity(product.getQuantity() - 1);
    }
}
