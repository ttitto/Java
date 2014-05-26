package examsample;
import java.math.BigDecimal;
import java.util.Scanner;

public class Task01SimpleCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal x = sc.nextBigDecimal();
        BigDecimal y = sc.nextBigDecimal();
        BigDecimal zero = BigDecimal.ZERO;

        if (x == zero && y == zero) {
            System.out.println("0");
        } else if (x == zero && y != zero) {
            System.out.println("5");
        } else if (y == zero && x != zero) {
            System.out.println("6");
        } else if (x.compareTo(zero) > 0 && y.compareTo(zero) > 0) {
            System.out.println("1");
        } else if (x.compareTo(zero) < 0 && y.compareTo(zero) > 0) {
            System.out.println("2");
        } else if (x.compareTo(zero) < 0 && y.compareTo(zero) < 0) {
            System.out.println("3");
        } else if (x.compareTo(zero) > 0 && y.compareTo(zero) < 0) {
            System.out.println("4");
        }

    }

}
