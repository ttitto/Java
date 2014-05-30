package examsample;

import java.util.Scanner;
import java.util.TreeSet;

public class Task04HayvanNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Long> hayvans = new TreeSet<>();
        int searchedSum = Integer.parseInt(sc.nextLine());
        int searchedDiff = Integer.parseInt(sc.nextLine());
        int ghidefDiff;
        int defabcDiff;
        int sum;
        int abc;
        int def;
        int ghi;
        for (int a = 5; a < 10; a++) {
            for (int b = 5; b < 10; b++) {
                for (int c = 5; c < 10; c++) {
                    for (int d = 5; d < 10; d++) {
                        for (int e = 5; e < 10; e++) {
                            for (int f = 5; f < 10; f++) {
                                for (int g = 5; g < 10; g++) {
                                    for (int h = 5; h < 10; h++) {
                                        for (int i = 5; i < 10; i++) {
                                            if (a + b + c + d + e + f + g + h + i != searchedSum) {
                                                continue;
                                            }
                                            abc = a * 100 + b * 10 + c;
                                            def = d * 100 + e * 10 + f;
                                            if ((def - abc) != searchedDiff || abc > def) {
                                                continue;
                                            }
                                            ghi = g * 100 + h * 10 + i;
                                            if (def > ghi || (ghi - def) != searchedDiff) {
                                                continue;
                                            }

                                            hayvans.add((long) (abc * 1000000 + def * 1000 + ghi));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (hayvans.size() < 1) {
            System.out.println("No");
        } else {
            hayvans.forEach(h -> System.out.println(h));
        }
    }

}
