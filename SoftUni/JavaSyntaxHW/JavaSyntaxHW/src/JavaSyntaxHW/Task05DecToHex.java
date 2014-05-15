
package JavaSyntaxHW;

import java.util.Scanner;

public class Task05DecToHex {
    /*Write a program that enters a positive integer number num and converts and 
    prints it in hexadecimal form. You may use some built-in method from the standard
    Java libraries. Examples:*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int dec=input.nextInt();
        System.out.printf("%02X\n",dec);
    }
}
