package CollectionsHW;

import java.util.Arrays;
import java.util.Scanner;

public class Task01SortNumArray {

    /*Write a program to enter a number n and n integer numbers and sort and 
     print them. Keep the numbers in array of integers: int[]. Examples:*/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] numArr=new int[n]; 
        for (int i = 0; i < n; i++) {
            numArr[i]=input.nextInt();
        }
        
        Arrays.sort(numArr);
        
        for (int num : numArr) {
            System.out.printf("%d ",num);
        }
        System.out.println("\n");
        
    }

}
