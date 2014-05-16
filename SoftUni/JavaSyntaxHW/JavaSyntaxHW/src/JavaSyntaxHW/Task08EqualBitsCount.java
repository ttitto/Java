package JavaSyntaxHW;

import java.util.Scanner;

public class Task08EqualBitsCount {
    /*Write a program to count how many sequences of two equal bits ("00" or "11")
     can be found in the binary representation of given integer number n (with overlapping). 
     Examples:
     n	binary representation of n	count
     5	101	0
     0	0	0
     15	1111	3
     5343	1010011011111	6
     62241	1111001100100001	9
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = Integer.toBinaryString(num);
        int sum = 0;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == str.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
