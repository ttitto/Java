package ConditionalStatements;

import java.util.Locale;
import java.util.Scanner;

/*6.    Напишете програма, която намира най-голямото по стойност число измежду дадени 5 числа.*/
public class Task06BiggestFrom5Numbers {

    public static void main(String[] args) {
        Locale.setDefault( Locale.US);
        Scanner input = new Scanner(System.in);
        double max = input.nextDouble();

        for (int i = 0; i < 4; i++) {
            double num = input.nextDouble();
            if (max < num) {
                max = num;
            }
        }
        
        System.out.printf("max %f\n",max);
    }
}
