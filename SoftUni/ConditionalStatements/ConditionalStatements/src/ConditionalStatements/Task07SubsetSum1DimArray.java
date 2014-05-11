package ConditionalStatements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/*7.    Дадени са няколко цели числа. Напишете програма, която намира
 онези подмножества от тях, които имат сума 0. Примери:
 -     Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
 -     Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.*/
public class Task07SubsetSum1DimArray {

    public static void main(String[] args) {
        int target = 9;
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(", ");
        int len = strings.length;
        int[] numbers = new int[len];
        int[][] sums = new int[len][];

        for (int i = 0; i < len; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
            sums[i] = new int[(int) Math.pow(2, i)];
            sums[i][0] = numbers[i];
        }

        sums[2][1]=9;
        sums[2][2]=5;
        sums[2][3]=11;
        
        int row = 3;
        for (int col = 1; col < (int) Math.pow(2, row); col++) {
            
            for (int i = (int)Math.pow(2, row-1)-1; i >=0; i--) {
                sums[row][col]=sums[row][0]+sums[row-1][i];
            }
        }

//Print
        for (int[] arr : sums) {
            for (int sum : arr) {
                System.out.println(sum);
            }
        }

    }
}
