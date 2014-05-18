package LoopsMethodsClassesHW;

import java.util.Scanner;

public class Task02ThreeLetterWords {
    /*Write a program to generate and print all 3-letter words consisting of given
     set of characters. For example if we have the characters 'a' and 'b', all
     possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb".
     The input characters are given as string at the first line of the input. 
     Input characters are unique (there are no repeating characters). Examples:*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String seq = input.nextLine();
        int len = seq.length();

        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len ; j++) {
                for (int k = 0; k < len; k++) {
                    sb.append(seq.charAt(i));
                    sb.append(seq.charAt(j));
                    sb.append(seq.charAt(k));
                    sb.append(' ');
                }
            }
        }
        System.out.println(sb.toString());
    }
}
