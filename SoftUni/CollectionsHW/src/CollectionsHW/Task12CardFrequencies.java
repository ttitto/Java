package CollectionsHW;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task12CardFrequencies {
    /*We are given a sequence of N playing cards from a standard deck. The input 
     consists of several cards (face + suit), separated by a space. Write a program 
     to calculate and print at the console the frequency of each card face in format
     "card_face -> frequency". The frequency is calculated by the formula 
     appearances / N and is expressed in percentages with exactly 2 digits after 
     the decimal point. The card faces with their frequency should be printed in
     the order of the card face's first appearance in the input. The same card can
     appear multiple times in the input, but it's face should be listed only once
     in the output. Examples:*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> cards = new HashMap<>();
        Queue<String> order = new LinkedList<>();

        int currentCount;
        String[] arr = sc.nextLine().split(" ");
        int cnt = arr.length;
        for (int i = 0; i < cnt; i++) {
            String input = arr[i];

            String face = input.substring(0, input.length() - 1);
            if (!cards.containsKey(face)) {
                cards.put(face, 1);
                order.add(face);
            } else {
                currentCount = cards.get(face) + 1;
                cards.put(face, currentCount);
            }
        }
        int orderSize = order.size();
        for (int i = 0; i < orderSize; i++) {
            String element = order.remove();
            double percent = 100 * cards.get(element) / (float) cnt;

            System.out.printf("%s -> %.2f%s\n", element, percent, "%");
        }
    }
}
