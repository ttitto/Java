package ConditionalStatements;

import java.util.Locale;
import java.util.Scanner;

/*2.    Напишете програма, която показва знака (+ или -) от частното на две 
 реални числа, без да го пресмята.*/
public class Task02ShowSign {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        double second = input.nextDouble();

        if ((first < 0 && second < 0) || (first > 0 && second > 0)) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }
}
