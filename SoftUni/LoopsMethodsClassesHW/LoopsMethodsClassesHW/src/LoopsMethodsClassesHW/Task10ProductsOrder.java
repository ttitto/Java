package LoopsMethodsClassesHW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task10ProductsOrder {
    /*Create a class Product to hold products, which have name (string) and price
     (decimal number). Read from a text file named "Products.txt" a list of product with 
     prices and keep them in a list of products. Each product will be in format 
     name + space + price. You should hold the products in objects of class Product. 
     Read from a text file named "Order.txt" an order of products with quantities. 
     Each order line will be in format product + space + quantity. 
     Calculate and print in a text file "Output.txt" the total price of the order. 
     Ensure you close correctly all used resources. Examples:*/

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        HashSet<Product> products = new HashSet<>();
        BigDecimal totalAmount = BigDecimal.ZERO;

        //Read products list from file
        try (BufferedReader readProducts = new BufferedReader(new FileReader("..\\products2.txt"))) {
            String line = readProducts.readLine();
            while (line != null) {
                String[] prod = line.split(" ");
                products.add(new Product(prod[0], BigDecimal.valueOf(Double.parseDouble(prod[1]))));

                line = readProducts.readLine();
            }

        } catch (IOException ex) {
            Logger.getLogger(Task10ProductsOrder.class.getName()).log(Level.SEVERE, null, ex.getMessage());
        }

        //Read orders list from file
        try (BufferedReader readOrders = new BufferedReader(new FileReader("..\\order2.txt"))) {
            String line = readOrders.readLine();
            while (line != null) {
                String[] orders = line.split(" ");

                for (Product prod : products) {
                    if (prod.getName().equals(orders[1])) {
                      totalAmount=  totalAmount.add(prod.getPrice().multiply(BigDecimal.valueOf(Double.parseDouble(orders[0]))));
                    }
                }
                line = readOrders.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Task10ProductsOrder.class.getName()).log(Level.SEVERE, null, ex);
        }

        //System.out.println(totalAmount);
        
        //Write to output file
        try (BufferedWriter wr=new BufferedWriter(new FileWriter("..\\output.txt"))){
            wr.write(totalAmount.toString());
        } catch (IOException ex) {
            Logger.getLogger(Task10ProductsOrder.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

}
