package CollectionsHW;

import java.util.Scanner;

public class Task05WordsCount {
    /*Write a program to count the number of words in given sentence. 
     Use any non-letter character as word separator.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        String pattern = "\\W+";
        String[] words = input.split(pattern);
        System.out.println(words.length);

    }
}
