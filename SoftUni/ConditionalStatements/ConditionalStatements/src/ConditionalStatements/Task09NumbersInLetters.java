package ConditionalStatements;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/*9.    Напишете програма, която преобразува дадено число в интервала [0..999]
 в текст, съответстващ на българското произношение. Примери:
 -     0  "Нула"
 -     273  "Двеста седемдесет и три"
 -     400  "Четиристотин"
 -     501  "Петстотин и едно"
 -     711  "Седемстотин и единадесет"
 */
public class Task09NumbersInLetters {

    public static void main(String[] args) throws UnsupportedEncodingException {
        PrintStream out = new PrintStream(System.out, true, "UTF-8");
        System.setOut(out);

        Scanner input = new Scanner(System.in);
        String number = padLeft(input.nextLine(), 3);

        String ones = number.substring(2, 3);
        String tens = number.substring(1, 2);
        String hundreds = number.substring(0, 1);
        
        StringBuilder sb=new StringBuilder();
        
        if (hundreds=="" && tens=="") {
            System.out.println("yes");
        }
        
        System.out.println(hundreds);
    }

    public static String padLeft(String s, int n) {
        return String.format("%1$" + n + "s", s);
    }
}
