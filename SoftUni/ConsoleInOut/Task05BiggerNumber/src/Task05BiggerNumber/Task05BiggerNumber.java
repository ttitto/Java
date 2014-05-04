package Task05BiggerNumber;
/*5.  Напишете програма, която чете от конзолата две цели числа и отпечатва 
 по-голямото от тях. Реализирайте програмата без използва­нето на сравнение.
 Забележка: задачата изисква малко да помислите!*/
import java.util.Scanner;

public class Task05BiggerNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("first number: ");
        int firstNum = input.nextInt();
        System.out.print("second number: ");
        int secondNum = input.nextInt();

        if (secondNum - firstNum > 0) {
            System.out.println(secondNum);
        } else {
            System.out.println(firstNum);
        }
    }

}
