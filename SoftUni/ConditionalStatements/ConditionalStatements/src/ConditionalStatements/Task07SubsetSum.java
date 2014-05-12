package ConditionalStatements;

import java.util.Scanner;

/*7.    Дадени са няколко цели числа. Напишете програма, която намира
 онези подмножества от тях, които имат сума 0. Примери:
 -     Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
 -     Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.*/
public class Task07SubsetSum {

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

        //Fill 2Dim array sums with all possible sums
        int row=2;
        fillRow(sums,row );
        
        
//Print
        for (int[] arr : sums) {
            for (int sum : arr) {
                System.out.println(sum);
            }
        }

    }
    public static void fillRow(int[][] sums, int row){
        
    }
}
