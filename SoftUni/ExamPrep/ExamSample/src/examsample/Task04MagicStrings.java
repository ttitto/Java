package examsample;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task04MagicStrings {

    static TreeMap<Character, Integer> letters = new TreeMap<Character, Integer>() {
        {
            put('s', 3);
            put('n', 4);
            put('k', 1);
            put('p', 5);
        }
    };
    static StringBuilder seq = new StringBuilder();

    public static void main(String[] args) {

        TreeSet<String> magics = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        sc.nextLine();

        for (Character s : letters.keySet()) {
            for (Character n : letters.keySet()) {
                for (Character k : letters.keySet()) {
                    for (Character p : letters.keySet()) {
                        for (Character s1 : letters.keySet()) {
                            for (Character n1 : letters.keySet()) {
                                for (Character k1 : letters.keySet()) {
                                    for (Character p1 : letters.keySet()) {
                                        seq.append(s).append(n).append(k).append(p).append(s1).append(n1).append(k1).append(p1);
                                        int myDiff = calculateWeight(seq.subSequence(0, 4)) - calculateWeight(seq.subSequence(4, 8));
                                        if (myDiff < 0) {
                                            myDiff *= -1;
                                        }
                                        if (myDiff == diff) {
                                            magics.add(seq.toString());
                                        }
                                        seq.setLength(0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (magics.isEmpty()) {
            System.out.println("No");
        } else {
            for (String string : magics) {
                System.out.println(string);
            }
        }
    }

    private static int calculateWeight(CharSequence subSequence) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += letters.get(subSequence.charAt(i));
        }
        return sum;
    }

}
