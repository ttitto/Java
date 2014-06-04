package examsample;

import java.util.Scanner;
import java.util.TreeSet;

public class Task01StuckNumbers {

    static int loopsCount;
    static int iterationsCount;
    static int[] loops;
    static boolean noAnswers = true;
    static String[] allNums;
    static TreeSet<String> results = new TreeSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        loopsCount = 4;
        iterationsCount = n;

        loops = new int[loopsCount];
        allNums = sc.nextLine().split(" ");
        if (n < 4) {
            System.out.println("No");
            return;
        }
        nestedLoops(0);

        if (noAnswers) {
            System.out.println("No");
        } else {
//            for (String string : results) {
//                System.out.println(string);
//            }
        }
    }

    public static void combine(String[] fourNums) {

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
//                if (i == j) {
//                    continue;
//                }
                String left = fourNums[i] + fourNums[j];
                for (int k = j + 1; k < 4; k++) {
//                    if (k == j || k == i) {
//                        continue;
//                    }
                    for (int x = k + 1; x < 4; x++) {
//                        if (x == k || x == i || x == j) {
//                            continue;
//                        }
                        String right = fourNums[k] + fourNums[x];
                        if (left.equals(right)) {
                            noAnswers = false;
                            String result = String.format("%s|%s==%s|%s", fourNums[i], fourNums[j], fourNums[k], fourNums[x]);
                            //results.add(result);
                            System.out.printf("%s|%s==%s|%s\n", fourNums[i], fourNums[j], fourNums[k], fourNums[x]);
                        }
                    }
                }
            }
        }

    }

    public static void nestedLoops(int currentLoop) {
        if (currentLoop == loopsCount) {
            int l0 = loops[0];
            int l1 = loops[1];
            int l2 = loops[2];
            int l3 = loops[3];

            if (l0 == l1 || l0 == l2 || l0 == l3) {
                return;
            } else if (l1 == l2 || l1 == l3) {
                return;
            } else if (l2 == l3) {
                return;
            }
            String[] arr = {allNums[l0], allNums[l1], allNums[l2], allNums[l3]};
            combine(arr);
            return;
        } else {
            for (int i = 0; i < iterationsCount; i++) {
                loops[currentLoop] = i;
                nestedLoops(currentLoop + 1);
            }
        }
    }

    private static void allCombinations() {

    }

}
