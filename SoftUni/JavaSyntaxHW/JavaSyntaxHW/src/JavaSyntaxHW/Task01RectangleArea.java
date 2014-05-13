
package JavaSyntaxHW;

import java.util.Scanner;

public class Task01RectangleArea {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sides =input.nextLine().split(" ");
        
        int a=Integer.parseInt( sides[0]);
        int b=Integer.parseInt( sides[1]);
        
        System.out.printf("%.2f\n",calculateArea(a, b));
    }
    public static double calculateArea(int sideA, int sideB){
        return sideA*sideB;
    }
    
}
