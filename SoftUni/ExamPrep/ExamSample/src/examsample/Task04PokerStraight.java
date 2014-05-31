package examsample;

import java.util.Scanner;

public class Task04PokerStraight {

    public static void main(String[] args) {
        int[] faces = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        int[] suits = {1, 2, 3, 4};
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        int faceWeight = 0;

        for (int f = 0; f < 10; f++) {
            faceWeight = 10 * faces[f] + 20 * faces[f + 1] + 30 * faces[f + 2] + 40 * faces[f + 3] + 50 * faces[f + 4];
            for (int a = 1; a < 5; a++) {
                for (int b = 1; b < 5; b++) {
                    for (int c = 1; c < 5; c++) {
                        for (int d = 1; d < 5; d++) {
                            for (int i = 1; i < 5; i++) {
                                if ((a + b + c + d + i + faceWeight) == weight) {
                                    result++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

}
