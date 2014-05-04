/*6.  Напишете програма, която чете пет числа и отпечатва тяхната сума.
 */
package Task06SumOf5Numbers;

import java.util.Locale;
import java.util.Scanner;

public class Task06SumOf5Numbers {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        System.out.println("Insert five numbers:");
        double first = input.nextDouble();
        double second = input.nextDouble();
        double third = input.nextDouble();
        double fourth = input.nextDouble();
        double fifth = input.nextDouble();

        System.out.print("The sum is: ");
        System.out.println(first + second + third + fourth + fifth);
    }

}
