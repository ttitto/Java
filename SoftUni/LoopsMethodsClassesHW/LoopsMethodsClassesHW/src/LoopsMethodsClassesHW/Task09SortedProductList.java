package LoopsMethodsClassesHW;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.function.ToDoubleFunction;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task09SortedProductList {
    /*Create a class Product to hold products, which have name (string) and price 
     (decimal number). Read from a text file named "Input.txt" a list of products.
     Each product will be in format name + space + price. You should hold the products 
     in objects of class Product. Sort the products by price and write them in format 
     price + space + name in a file named "Output.txt". Ensure you close correctly 
     all used resources. Examples:
     Input.txt	Output.txt
     juice 2.50
     water 1.20
     vodka 18.70
     beer 1.12	1.12 beer
     1.20 water
     2.50 juice
     18.70 vodka
     */

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("..\\products1.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("..\\output.txt"))) {//change filename to products2 to check other tests

            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                Product prod = new Product(data[0], BigDecimal.valueOf(Double.parseDouble(data[1])));
                products.add(prod);
                line = br.readLine();
            }

            StringBuilder sb = new StringBuilder();

            Comparator<Product> pr = (p1, p2) -> p1.price.compareTo(p2.price);
            products.stream().sorted(pr).forEach(str -> sb.append(str.toString()).append('\n'));

            bw.write(sb.toString());

        } catch (IOException ex) {
            Logger.getLogger(Task09SortedProductList.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

}
