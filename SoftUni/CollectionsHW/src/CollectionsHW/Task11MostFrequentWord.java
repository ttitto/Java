package CollectionsHW;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Task11MostFrequentWord {
    /*Write a program to find the most frequent word in a text and print it, 
     as well as how many times it appears in format "word -> count". Consider 
     any non-letter character as a word separator. Ignore the character casing. 
     If several words have the same maximal frequency, print all of them in alphabetical order. 
     Examples:*/

    public static void main(String[] args) {
        TreeMap<String, Integer> words = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        String pattern = "\\W+";
        String input = sc.nextLine();
        int max = 0;

        for (String string : input.split(pattern)) {
           
                int val = words.ceilingEntry(string).getValue();
                if (max < val + 1) {
                }
            
        }
words.forEach((k,v)->System.out.println(k));
    }
}
