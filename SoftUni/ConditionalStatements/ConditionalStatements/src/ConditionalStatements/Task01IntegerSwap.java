package ConditionalStatements;

import java.util.Scanner;

/*1.    Да се напише if-конструкция, която изчислява стойността на две целочислени 
променливи и разменя техните стойности, ако стойността на първата променлива е по-голяма от втората.
*/
public class Task01IntegerSwap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first= input.nextInt();
        int second= input.nextInt();
        
        if (first>second) {
            int temp=first;
            first=second;
            second=temp;
        }
        
        System.out.printf("first: %d\n",first);
        System.out.printf("second: %d\n5",second);
    }
    
}
