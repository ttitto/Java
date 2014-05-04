package TripleSum;

/*Напишете програма, която чете от конзолата три числа от тип int и отпечатва тяхната сума.*/
import java.util.Locale;
import java.util.Scanner;

public class TripleSum {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.print("Insert first integer number: ");
        int firstInt = input.nextInt();
        System.out.print("Insert first integer number: ");
        int secondInt = input.nextInt();
        System.out.print("Insert first integer number: ");
        int thirdInt = input.nextInt();

        System.out.printf("The sum of the three integers is: %d%n", firstInt + secondInt + thirdInt);
    }

}
