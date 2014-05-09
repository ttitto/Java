package ConditionalStatements;

import java.util.Scanner;

/*5.    Напишете програма, която при въвеждане на коефициентите (a, b и c) на 
 квадратно уравнение, изчислява и извежда неговите реални корени.
 */
public class Task05QuadraticEquation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double x1;
        double x2 ;

        double discr = Math.sqrt((b * b - 4 * a * c));

        if (discr < 0 || Double.isNaN(discr)) {
            System.out.println("no real roots");
        } else {
            x1 = (-b + discr) / 2 * a;
            x2 = (-b - discr) / 2 * a;
            System.out.printf("x1=%.2f%nx2=%.2f%n", x1, x2);
        }
    }
}
