package IntroToJavaHW;

import java.time.LocalDateTime;
import java.util.Locale;

/*Task 05: Create a simple Java program CurrentDateTime.java to print the current 
 date and time. Submit the Java class CurrentDateTime as part of your homework.*/
public class CurrentDateTime {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }
}
