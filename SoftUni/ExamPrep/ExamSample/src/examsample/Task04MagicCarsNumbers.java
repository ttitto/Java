package examsample;

import java.util.Scanner;

public class Task04MagicCarsNumbers {

    static int resultCounter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] letterValues = {10, 20, 30, 50, 80, 110, 130, 160, 200, 240};
        int magicNum = Integer.parseInt(sc.nextLine());
        int valCount = letterValues.length;

        for (int i = 0; i < valCount; i++) {
            for (int j = 0; j < valCount; j++) {
                int target = magicNum - 40 - letterValues[i] - letterValues[j];
                boolean toContinue = true;
                for (int a = 0; a < 10; a++) {
                    for (int b = 0; b < 10; b++) {
                        //aaaa
                        //bbbb
                        //abbb
                        //baaa
                        //aaab
                        //bbba
                        //aabb
                        //bbaa
                        //abab
                        //baba
                        //abba
                        //baab
                        
                        int current = a + b + b + b;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = b + a + a + a;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = a + a + a + b;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = b + b + b + a;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = a + a + b + b;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = b + b + a + a;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = a + b + a + b;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = b + a + b + a;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = a + b + b + a;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = b + a + a + b;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = a + a + a + a;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                        current = b + b + b + b;
                        if (increaseCounter(current, target, a, b)) {
                            continue;
                        }
                    }
                }
            }
        }
        System.out.println(resultCounter);
    }

    private static boolean increaseCounter(int current, int target, int a, int b) {
        if (current == target) {
            resultCounter++;
            System.out.printf("%s %s %s %s\n", current, target, a, b);
            return true;
        }
        return false;
    }

}
