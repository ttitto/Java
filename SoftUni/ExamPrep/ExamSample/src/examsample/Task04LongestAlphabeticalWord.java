package examsample;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Task04LongestAlphabeticalWord {

    static Comparator<String> bySize = new Comparator<String>() {

        public int compare(String i, String j) {
            if (i.length() > j.length()) {
                return -1;
            } else if (i.length() == j.length()) {
                return i.compareTo(j);
            } else {
                return 1;
            }
        }
    };
    static TreeSet<String> lexWords = new TreeSet<>(bySize);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder w = new StringBuilder();
        w.append(sc.nextLine());
        int n = sc.nextInt();
        sc.nextLine();

        int wordLen = w.length();
        for (int i = 0; i < n * n; i++) {
            w.append(w.charAt(i));
        }
        w.delete(0, wordLen);

        //add all lex sequences to a treeset
        for (int i = 0; i < w.length(); i++) {
            lexWords.add(checkRight(w, i, n));
            lexWords.add(checkLeft(w, i, n));
            lexWords.add(checkUp(w, i, n));
            lexWords.add(checkDown(w, i, n));
        }

        //print result
        System.out.println(lexWords.first());
    }

    static String checkRight(StringBuilder w, int indx, int size) {
        StringBuilder result = new StringBuilder();
        result.append(w.charAt(indx));
        int i = indx;
        for (i = indx; i < (i / size) * size + size - 1; i++) {

            if (w.charAt(i) < w.charAt(i + 1)) {
                result.append(w.charAt(i + 1));
            } else {
                break;
            }
        }

        return result.toString();
    }

    static String checkLeft(StringBuilder w, int indx, int size) {
        StringBuilder result = new StringBuilder();
        result.append(w.charAt(indx));
        if (indx == 0) {
            return result.toString();
        }

        for (int i = indx; i > ((indx < size) ? 0 : ((i % size) * (size)));
                i--) {
            if (w.charAt(i - 1) > w.charAt(i)) {
                result.append(w.charAt(i - 1));
            } else {
                break;
            }
        }
        return result.toString();
    }

    private static String checkUp(StringBuilder w, int indx, int size) {
        StringBuilder result = new StringBuilder();
        result.append(w.charAt(indx));
        if (indx < size) {
            return result.toString();
        }
        for (int i = indx; i >= size; i -= size) {
            if (w.charAt(i) < w.charAt(i - size)) {
                result.append(w.charAt(i - size));
            } else {
                break;
            }
        }
        return result.toString();
    }

    private static String checkDown(StringBuilder w, int indx, int size) {
        StringBuilder result = new StringBuilder();
        result.append(w.charAt(indx));
        if (indx > w.length() - size) {
            return result.toString();
        }
        for (int i = indx; i < w.length() - size; i += size) {
            if (w.charAt(i) < w.charAt(i + size)) {
                result.append(w.charAt(i + size));
            } else {
                break;
            }
        }
        return result.toString();
    }

}
