package CollectionsHW;

import java.util.Scanner;

public class Task02EqualStringSequences {
    /*Write a program that enters an array of strings and finds in it all sequences
     of equal elements. The input strings are given as a single line, separated 
     by a space. Examples:
     Input                   Output
     hi yes yes yes bye	hi
     yes yes yes
     bye
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String[] strings = sc.nextLine().split(" ");
        int n = strings.length;

        for (int i = 1; i < n; i++) {
            if (!strings[i - 1].equals(strings[i])) {
                sb.append(strings[i - 1]);
                System.out.println(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(strings[i - 1]);
                sb.append(" ");
            }
        }
        if (strings[n - 1].equals( strings[n - 2])) {
            System.out.printf("%s%s\n",sb.toString(), strings[n - 1]);
        } else {
            System.out.println(strings[n - 1]);
        }

    }
}
