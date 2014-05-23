package CollectionsHW;

import java.util.Scanner;
import java.util.TreeMap;

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
        int max = 1;
        String[] inputArr=input.toLowerCase().split(pattern);
        int val=1;
        for (String string : inputArr) {
            
            if ((words.containsKey(string))) {
                 val=words.get(string);
             words.put(string, val+1);
             if (max<val+1) {
                max=val+1;
            }
            } else{
                words.put(string, 1);
            }
            
        }
        final int m=max;
        words.forEach((k, v) -> {
            if (v ==m) {
                if (v==1) {
                System.out.printf("%s -> %d time\n",k,v);
                } else{
                System.out.printf("%s -> %d times\n",k,v);    
                }
            }
        });
    }
}
