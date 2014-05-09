package ConditionalStatements;

import java.util.Scanner;

/*3.    Напишете програма, която намира най-голямото по стойност число, измежду три дадени числа.*/
public class Task03BiggestFromThree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int max;
        if (first > second) {
            max = first;
        } else {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        
        System.out.printf("max: %d\n",max);
    }
}
