package CollectionsHW;

import java.util.HashSet;
import java.util.Scanner;

public class Task03LongestEqualLengthSequence {
    /*Write a program that enters an array of strings and finds in it the largest sequence
     of equal elements. If several sequences have the same longest length, print the 
     leftmost of them. The input strings are given as a single line, separated by a space.
     Examples:*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> counts = new HashSet<>();

        String[] input = sc.nextLine().split(" ");
        String leftmost = input[0];
        int count = 1;
        int maxCount = count;
        counts.add(0);
        counts.add(count);
        /*Loops through the input array and counts the occurences of the current string element.
         For every Iteration the current count of occurences is inserted in a HashSet. 
         The current most frequent element and its count is hold in the variables leftmost and maxCount*/
        for (int i = 1; i <= input.length - 1; i++) {

            if (input[i - 1].equals(input[i])) {
                count++;
                if (maxCount < count) {
                    counts.add(count);
                    leftmost = input[i];
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }

        for (int i = 1; i <= maxCount; i++) {
            System.out.printf("%s ", leftmost);
        }
        System.out.println("");

    }
}
