package ConditionalStatements;

import java.util.Scanner;
import java.util.Stack;

/*7.    Дадени са няколко цели числа. Напишете програма, която намира
 онези подмножества от тях, които имат сума 0. Примери:
 -     Ако са дадени числата {-2, -1, 1}, сумата на -1 и 1 е 0.
 -     Ако са дадени числата {3, 1, -7}, няма подмножества със сума 0.*/
public class Task07SubsetSum {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int target = 7;
        String[] strings = input.nextLine().split(", ");
        int len = strings.length;

        int[][] sums = new int[len][];

        //Fill 2Dim array sums with all possible sums
        for (int row = 0; row < len; row++) {
            int initialSum = Integer.parseInt(strings[row]);
            sums[row] = fillRow(sums, initialSum, row);
        }

        Stack<Integer> stack = new Stack<>();

        int targetIndx;
        int newTargetIndx;
        for (int r = len; r > 0; r--) {
            getSubset(r, target, sums, stack);
        }

    }

    public static void getSubset(int len, int newTarget, int[][] sums, Stack<Integer> stack) {
        int newTargetIndx;
        for (int r = len - 1; r >= 0; r--) {
            newTargetIndx = getLastIndexOf(newTarget, sums[r]);
            if (newTargetIndx < 0) {
            } else {
                newTarget = sums[r][newTargetIndx] - sums[r][0];
                stack.push(sums[r][0]);
            }
        }
        while (!stack.isEmpty()) {
            System.out.printf("%d, ", stack.pop());
        }
        System.out.println("");

//        //Print all sums
//        for (int[] arr : sums) {
//            for (int sum : arr) {
//                System.out.println(sum);
//            }
//        }
    }

    public static int getLastIndexOf(int target, int[] arr, int start, int end) {

        for (int i = end; i >= start; i--) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int getLastIndexOf(int target, int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        return getLastIndexOf(target, arr, start, end);
    }

    public static int[] fillRow(int[][] sums, int rowInitialValue, int row) {
        int sumsCount = (int) Math.pow(2, row);
        int[] sumsRow = new int[sumsCount];

        if (row == 0) {
            sumsRow[0] = rowInitialValue;
        } else if (row == 1) {
            sumsRow[0] = rowInitialValue;
            sumsRow[1] = rowInitialValue + sums[0][0];
        } else {

            int col = 0;
            for (int r = row - 1; r >= 0; r--) {
                if (col == 0) {
                    sumsRow[col] = rowInitialValue;
                    col++;
                }
                for (int c = sums[r].length - 1; c >= 0; c--) {

                    sumsRow[col] = sumsRow[0] + sums[r][c];
                    col++;

                }
            }
        }
        return sumsRow;
    }
}
