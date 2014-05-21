package CollectionsHW;

import java.util.Scanner;

public class Task04IncreasingSequences {
    /*Write a program to find all increasing sequences inside an array of integers. 
     The integers are given in a single line, separated by a space. Print the sequences 
     in the order of their appearance in the input array, each at a single line. 
     Separate the sequence elements by a space. Find also the longest increasing sequence 
     and print it at the last line. If several sequences have the same longest length, 
     print the leftmost of them. Examples:*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder currSeq = new StringBuilder();
        StringBuilder longestSeq = new StringBuilder();

        String[] strings = sc.nextLine().split(" ");
        int len = strings.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        currSeq.append(nums[0]).append(" ");
        for (int i = 1; i < len; i++) {
            //if next number is smaller
            if (nums[i - 1] > nums[i]) {
                System.out.printf("%s\n", currSeq.toString());
                currSeq.setLength(0);
            } else {   //if increasing sequence continues
                currSeq.append(nums[i]).append(" ");
            }
        }
    }
}
