package IntroToJavaHW;

import java.util.Arrays;
import java.util.Scanner;

/*Task08: Write a program that enters from the console number n and n strings, then sorts 
 them alphabetically and prints them. Note: you might need to learn how to use loops
 and arrays in Java (search in Internet). Examples:
 Input	Output
 5
 Sofia
 Plovdiv
 Varna
 Pleven
 Bourgas	Bourgas
 Pleven
 Plovdiv
 Sofia
 Varna
 */
public class SortStringArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insert the number of string items: ");
        int n = input.nextInt();
        String[] myArr = new String[n];

        for (int i = 0; i < n; i++) {
            myArr[i] = input.next();
        }
        Arrays.sort(myArr);
        for (int i = 0; i < n; i++) {
            System.out.println(myArr[i]);
        }
    }
}
