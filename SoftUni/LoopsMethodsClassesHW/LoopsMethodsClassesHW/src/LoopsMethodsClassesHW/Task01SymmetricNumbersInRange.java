package LoopsMethodsClassesHW;

import java.util.Scanner;

public class Task01SymmetricNumbersInRange {
    /*Write a program to generate and print all symmetric numbers in given range [start…end]. 
     A number is symmetric if its digits are symmetric toward its middle. 
     For example, the numbers 101, 33, 989 and 5 are symmetric,
     but 102, 34 and 997 are not symmetric. Examples:*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt(  );
        int end=input.nextInt();
        boolean isSym=true;
        
        for (int i = start; i <= end; i++) {
            String str=String.valueOf(i);
            int len=str.length();
            for (int indx = 0; indx < len/2+1; indx++) {
                if (str.charAt(indx)!=str.charAt(len-1-indx)) {
                    isSym=false;
                    break;
                }
            }
            if (isSym==true) {
                System.out.printf("%d, ",i);
            }
            isSym=true;
            
        }

    }

}
