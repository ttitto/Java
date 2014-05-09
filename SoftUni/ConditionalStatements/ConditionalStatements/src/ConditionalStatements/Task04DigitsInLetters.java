package ConditionalStatements;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/*4.    Напишете програма, която за дадена цифра (0-9), зададена като вход,
 * извежда името на цифрата на български език.*/
public class Task04DigitsInLetters {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner input = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        System.setOut(out);
        int digit = input.nextInt();
        switch (digit) {
            case 0:
                out.println("нула");
                break;
            case 1:
                out.println("едно");
                break;
            case 2:
                out.println("две");
                break;
            case 3:
                out.println("три");
                break;
            case 4:
               out.println("четири");
                break;
            case 5:
                System.out.println("пет");
                break;
            case 6:
                System.out.println("шест");
                break;
            case 7:
                System.out.println("седем");
                break;
            case 8:
                System.out.println("осем");
                break;
            case 9:
                System.out.println("девет");
                break;
            default:
                throw new AssertionError("Не познавам тази цифра!");
        }
    }
}
