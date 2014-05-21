package CollectionsHW;

import java.util.ArrayList;
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
        ArrayList<Integer> currSeq = new ArrayList();
        ArrayList<Integer> longest = new ArrayList();
        int maxCount = 0;

        String[] strings = sc.nextLine().split(" ");
        int len = strings.length;
        int[] nums = new int[len + 1];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        nums[len] = Integer.MIN_VALUE;
        //currSeq.append(nums[0]).append(" ");
        for (int i = 0; i < len; i++) {
            //if next number is not bigger
            if (nums[i] >= nums[i + 1]) {
                currSeq.add(nums[i]);
                System.out.printf("%s\n", currSeq.toString().replaceAll("[\\[\\]]", ""));
                // check if it is the longest sequence
                if (maxCount<currSeq.size()) {
                    maxCount=currSeq.size();
                    longest=(ArrayList)currSeq.clone();
                }
                
                currSeq.clear();
            } else {   //if increasing sequence continues
                currSeq.add(nums[i]);
            }

        }
        System.out.printf("Longest: %s\n",longest.toString().replaceAll("[\\[\\]]", ""));
    }
}
