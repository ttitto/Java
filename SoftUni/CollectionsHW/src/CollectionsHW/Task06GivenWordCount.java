package CollectionsHW;

import java.util.Scanner;

public class Task06GivenWordCount {
/*Write a program to find how many times a word appears in given text. The text 
    is given at the first input line. The target word is given at the second input 
    line. The output is an integer number. Please ignore the character casing. 
    Consider that any non-letter character is a word separator. Examples:*/    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat="\\W+";
        String[] input=sc.nextLine().split(pat);
        String searched=sc.nextLine();
        
        int count=0;
        for (String word : input) {
            if (word.toLowerCase().equals(searched.toLowerCase())) {
                count++;
            }
        }
        
        System.out.println(count);
        
    }
}
