package Task04AliquotsOf5;

import java.util.Scanner;


/*4.  Напишете програма, която чете от конзолата две цели числа (integer) и 
отпечатва, колко числа има между тях, такива, че остатъкът им от деленето 
на 5 да е 0.*/
public class Task04AliquotsOf5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter=0;
        
        System.out.print("smaller integer: ");
        int firstNum=input.nextInt();
        System.out.print("bigger integer: ");
        int secondNum=input.nextInt();
        
        for (int i = firstNum+1; i < secondNum; i++) {
            if (i%5==0) {
                int nextDivider=i;
                do {                    
                    counter++;
                    nextDivider+=5;
                } while (nextDivider<secondNum);
                break;
            }
        }
        
        System.out.printf("The count of aliquots of 5 between %d and %d is %d\n",
                firstNum,
                secondNum,
                counter);
        
    }
    
}
