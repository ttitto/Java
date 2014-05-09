package ConditionalStatements;

import java.util.Scanner;

/*8.    Напишете програма, която прилага бонус точки към дадени точки в интервала 
[1..9] чрез прилагане на следните правила:
-     Ако точките са между 1 и 3, програмата ги умножава по 10.
-     Ако точките са между 4 и 6, ги умножава по 100.
-     Ако точките са между 7 и 9, ги умножава по 1000.
-     Ако точките са 0 или повече от 9, се отпечатва съобщение за грешка.*/
public class Task08BonusPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int initialPoints=input.nextInt();
         int finalPoints;
         switch (initialPoints) {
            case 1:
            case 2:
            case 3:
                finalPoints=initialPoints*10;
                break;
                
            case 4:
            case 5:
            case 6:
                finalPoints=initialPoints*100;
                break;
            case 7:
            case 8:
            case 9:
                finalPoints=initialPoints*1000;
                break;
            default:
                System.out.println("Initial points are not in the required interval!");
                throw new AssertionError("Initial points are not in the required interval!");
        }
         System.out.printf("Bonus points: %d\n",finalPoints);
    }
}
