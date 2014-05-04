/*7.  Напишете програма, която чете пет числа и отпечатва най-голямото от тях. 
 Забележка: трябва да използвате конструкция "if", която до момента не сме разгледали.*/
package Task07BiggestFrom5;

import java.util.Locale;
import java.util.Scanner;

public class Task07BiggestFrom5 {

    public static void main(String[] args) {
        Locale.setDefault( Locale.US);
        double max;
        Scanner input = new Scanner(System.in);
        
        max = input.nextDouble();
        for (int i = 0; i < 4; i++) {
            double current = input.nextDouble();
            if (max < current) {
                max = current;
            }
        }
        System.out.println("the biggest number is " + max);
    }

}
