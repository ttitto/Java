package LoopsMethodsClassesHW;

import java.util.Locale;
import java.util.Locale;
import java.util.Scanner;

public class Task05AngleUnitConverter {
    /*Write a method to convert from degrees to radians. Write a method to convert
    from radians to degrees. You are given a number n and n queries for conversion.
    Each conversion query will consist of a number + space + measure. Measures are "deg"
    and "rad". Convert all radians to degrees and all degrees to radians. Print the results
    as n lines, each holding a number + space + measure. Format all numbers with 6 digit 
    after the decimal point. Examples:*/
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int count=input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < count; i++) {
            double num=input.nextDouble();
            String op=input.nextLine().trim();
            System.out.printf("%s\n",Convert(num,op));
        }
    }
    
    private static String Convert(double num, String operation){
        double pi=Math.PI;
        switch (operation) {
            case "deg":
                return String.format("%.6f",  num*pi/180)+" rad";
                
            case "rad":
                return String.format("%.6f", num*180/pi)+" deg";
            default:
                throw new AssertionError("Unknown conversion operation!");
        }
    }
}
