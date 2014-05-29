package examsample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Task04FiveSpecialLetters {

    static StringBuilder seq = new StringBuilder();
    static TreeSet<String> matchingSequences = new TreeSet<>();
    static TreeMap<Character, Integer> letters = new TreeMap<Character, Integer>() {
        {
            put('a', 5);
            put('b', -12);
            put('c', 47);
            put('d', 7);
            put('e', -32);
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();

        for (char a : letters.keySet()) {
            for (char b : letters.keySet()) {
                for (char c : letters.keySet()) {
                    for (char d : letters.keySet()) {
                        for (char e : letters.keySet()) {
                            seq.append(a).append(b).append(c).append(d).append(e);
                            int currentWeight = calculateWeight(seq);
                            if (currentWeight >= st && currentWeight <= end) {
                                matchingSequences.add(seq.toString());
                            }
                            seq.setLength(0);
                        }
                    }
                }
            }
        }
        if (matchingSequences.size() < 1) {
            System.out.println("No");
        } else {

            for (String match : matchingSequences) {
                System.out.printf("%s ", match);
            }
        }
    }

    private static int calculateWeight(StringBuilder sb) {
        HashSet<Character> distinct = new LinkedHashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            distinct.add(sb.charAt(i));
        }
        int cnt = 1;
        int sum = 0;
        for (Character character : distinct) {
            sum += cnt * letters.get(character);
            cnt++;
        }
        return sum;
    }

}
