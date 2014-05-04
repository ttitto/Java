package circleperimeter;
/*2.  Напишете програма, която чете от конзолата радиуса "r" на кръг и 
 отпечатва неговия периметър и обиколка.*/

import static java.lang.System.in;
import java.util.Locale;
import java.util.Scanner;

public class CirclePerimeter {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("US"));
        System.out.print("Insert the circle's radius: ");
        Scanner input = new Scanner(in);
        double radius = input.nextDouble();

        double perimeter = radius * Math.PI * 2;
        System.out.printf("The perimeter is: %.2f.%n", perimeter);

    }

}
