package CollectionsHW;

import java.util.Scanner;

public class Task07SubstringOccurencies {
/*Write a program to find how many times given string appears in given text as 
    substring. The text is given at the first input line. The search string is given 
    at the second input line. The output is an integer number. Please ignore the 
    character casing. Examples:*/    
    
    //Automat solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        String searched=sc.nextLine();
        int searchedLen=searched.length();
        int count=0;
        
        for (int i = 0; i <= input.length()-searchedLen; i++) {
            if (input.substring(i, searchedLen+i).toLowerCase().equals(searched.toLowerCase())) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
