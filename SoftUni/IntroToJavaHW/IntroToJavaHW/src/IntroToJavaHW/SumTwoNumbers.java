package IntroToJavaHW;

import java.util.Locale;
import java.util.Scanner;

/*Task 06: Write a program SumTwoNumbers.java that enters two integers from the console, 
 calculates and prints their sum. Search in Internet to learn how to read numbers from the console.
 Examples: 
 a	b	result
 5	2	8
 12	-7	5
 */
public class SumTwoNumbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insert first number: ");
        double firstNum = input.nextDouble();
        System.out.print("Insert second number: ");
        double secondNum = input.nextDouble();

        System.out.println(firstNum + secondNum);
    }
}
