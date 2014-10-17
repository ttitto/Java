package onelvshop;

import CustomExceptions.*;
import interfaces.Expirable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Stream;
import products.FoodProduct;
import products.Product;

public class OneLvShop {

    private static Stream<Product> soonestExpirable;
    private static Stream<Product> adultProductsByPrice;

    public static void main(String[] args) {
        List<Product> products = new ArrayList<Product>();
        List<Customer> customers = new ArrayList<Customer>();

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);
        products.add(cigars);

        Customer pecata = new Customer("Pecata", 17, 30.00);
        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        customers.add(pecata);
        customers.add(gopeto);

        try {
            PurchaseManager.processPurchase(gopeto, cigars);
            PurchaseManager.processPurchase(pecata, cigars);
        } catch (OutOfStockException |
                PaymentAmountException |
                ProductExpiredException |
                PurchasePermissionDeniedException e) {
            System.err.println(e.getMessage());
        }

        FoodProduct bread = new FoodProduct("bread", 0.80, 120, AgeRestriction.None,
                new GregorianCalendar(2016, 11, 20).getTime());
        products.add(bread);

        FoodProduct cheese = new FoodProduct("cheese", 6.30, 28, AgeRestriction.None,
                new GregorianCalendar(2015, 11, 28).getTime());
        products.add(cheese);

        // Expirable products ordered by soonest expriation date
        soonestExpirable = products.stream().
                filter(exp -> exp instanceof Expirable).
                filter(exp -> ((Expirable) exp).getExpirationDate() != null).
                sorted((a, b) -> Long.compare(((Expirable) a).getExpirationDate().getTime(),
                                ((Expirable) b).getExpirationDate().getTime())).
                map(pr -> pr);
        soonestExpirable.forEachOrdered(pr -> System.out.println(pr.toString()));

        // Products for adults ordered by price
        adultProductsByPrice = products.stream().
                filter(pr -> pr.getAgeRestriction() == AgeRestriction.Adult).
                sorted((a, b) -> Double.compare(a.getPrice(), b.getPrice())).
                map(pr -> pr);
        adultProductsByPrice.forEachOrdered(pr -> System.out.println(pr.toString()));
    }
}
