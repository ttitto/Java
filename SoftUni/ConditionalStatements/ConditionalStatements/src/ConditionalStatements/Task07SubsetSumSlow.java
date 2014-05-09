package ConditionalStatements;

import java.util.Scanner;

/*7.    Дадени са няколко цели числа. Напишете програма, която намира
 онези подмножества от тях, които имат сума 0. Примери:
 -     Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
 -     Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.*/
public class Task07SubsetSumSlow {

    public static void main(String[] args) {
        int target = 0;
        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(", ");
        int[] numbers = new int[strings.length];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }

        
    }
}
