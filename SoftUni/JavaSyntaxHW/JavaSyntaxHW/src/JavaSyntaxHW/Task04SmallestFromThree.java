package JavaSyntaxHW;

import java.util.Scanner;

public class Task04SmallestFromThree {
/*Write a program that finds the smallest of three numbers. Examples:*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float first=Float.parseFloat(input.nextLine());
        float second=Float.parseFloat(input.nextLine());
        float third=Float.parseFloat(input.nextLine());
        float min=first;
        
        if (min>second) {
            min=second;
        }else if(min>third){
            min=third;
        }
        
        System.out.println(Float.toString(min));
    }
}
