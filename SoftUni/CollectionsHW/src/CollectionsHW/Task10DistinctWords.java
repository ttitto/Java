package CollectionsHW;

import java.util.Scanner;
import java.util.TreeSet;

public class Task10DistinctWords {
    /*At the first line at the console you are given a piece of text. Extract all words 
     from it and print them in alphabetical order. Consider each non-letter character as 
     word separator. Take the repeating words only once. Ignore the character casing. 
     Print the result words in a single line, separated by spaces. Examples:*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String pattern = "\\W+";
        TreeSet<String> distinct=new TreeSet<>();
        
        ;
        for (String string : input.split(pattern)) {
            distinct.add(string.toLowerCase());
        }
        
        for (String string : distinct) {
            System.out.println(string);
        }
    }
}
