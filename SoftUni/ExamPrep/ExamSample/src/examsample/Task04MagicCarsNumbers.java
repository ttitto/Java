package examsample;

import java.util.Scanner;

public class Task04MagicCarsNumbers {

    static int resultCounter = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] letterValues = {10, 20, 30, 50, 80, 110, 130, 160, 200, 240};
        int magicNum = Integer.parseInt(sc.nextLine());
        int valCount = letterValues.length;
        StringBuilder sb = new StringBuilder();
        String patt = "([0-9])([0-9])\\2\\1|([0-9])\\3([0-9])\\4|(0-9){4}|([0-9])([0-9])\\6\\7|([0-9])\\8\\8([0-9])|([0-9])([0-9])\\11\\11";

        for (int i = 0; i < valCount; i++) {
            for (int j = 0; j < valCount; j++) {
                int target = magicNum - 40 - letterValues[i] - letterValues[j];
                int current;
                for (int a = 0; a < 10; a++) {
                    for (int b = 0; b < 10; b++) {

                        for (int c = 0; c < 10; c++) {
                            for (int d = 0; d < 10; d++) {
                                current = a + b + c + d;
                                sb.setLength(0);
                                sb.append(a).append(b).append(c).append(d);
                                if (current == target && sb.toString().matches(patt)) {
                                    resultCounter++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(resultCounter);
    }

}
