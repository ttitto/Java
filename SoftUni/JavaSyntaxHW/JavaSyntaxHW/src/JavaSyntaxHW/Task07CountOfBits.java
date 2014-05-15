package JavaSyntaxHW;

import java.util.Scanner;

public class Task07CountOfBits {
    /*Write a program to calculate the count of bits 1 in the binary representation
    of given integer number n. Examples:
n	binary representation of n	count
5	00000000 00000101	2
0	00000000 00000000	0
15	00000000 00001111	4
5343	00010100 11011111	7
62241	11110011 00100001	8
17263	01000011 01101111	9
*/
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        
        System.out.println(Integer.bitCount(num));
    }
}
