package CollectionsHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task09CombineWords {
    /*Write a program that reads two lists of letters l1 and l2 and combines them: 
     appends all letters c from l2 to the end of l1, but only when c does not appear 
     in l1. Print the obtained combined list. All lists are given as sequence of 
     letters separated by a single space, each at a separate line. 
     Use ArrayList<Character> of chars to keep the input and output lists. Examples:*/

    public static void main(String[] args) {

        List<Character> l1 = new ArrayList<>();
        List<Character> l2 = new ArrayList<>();
        List<Character> output = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            l1.add(c);
        }
        output.addAll(l1);
        input = sc.nextLine();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!l1.contains(c)) {
                output.add(' ');
                output.add(c);
            }
        }

        for (Character character : output) {
            System.out.print(character);
        }

    }
}
