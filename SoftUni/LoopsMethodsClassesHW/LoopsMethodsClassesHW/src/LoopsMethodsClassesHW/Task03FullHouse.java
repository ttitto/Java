package LoopsMethodsClassesHW;

import java.util.ArrayList;
import java.util.List;

public class Task03FullHouse {
    /*In most Poker games, the "full house" hand is defined as three cards of the same
     face + two cards of the same face, other than the first, regardless of the card's suits.
     The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" and "A".
     The card suits are "♣", "♦", "♥" and "♠". Write a program to generate and print all
     full houses and print their number. Example:*/

    public static String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static String[] suits = {"♣", "♦", "♥", "♠"};

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String[] cards = new String[52];
        List<String> triples = new ArrayList<>();
        List<String> doubles = new ArrayList<>();

        for (int f = 0, i = 0; f < faces.length; f++) {
            for (int s = 0; s < suits.length; s++, i++) {
                cards[i] = faces[f] + suits[s];
            }
        }
        for (int c = 0; c < 52; c += 4) {
            for (int i = c; i < c + 2; i++) {
                for (int j = i + 1; j < c + 3; j++) {
                    for (int k = j + 1; k < c + 4; k++) {
                        triples.add(cards[i] + cards[j] + cards[k]);
//                        System.out.print(cards[i] + cards[j] + cards[k]);
//                        System.out.print(" ");
                    }
                }
            }
//            System.out.println();
        }
        for (int c = 0; c < 52; c += 4) {
            for (int i = c; i < c + 3; i++) {
                for (int j = i + 1; j < c + 4; j++) {
                    doubles.add(cards[i] + cards[j]);
//                    System.out.print(cards[i] + cards[j]);
//                    System.out.print(" ");
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < triples.size(); i++) {
            for (int j = 0; j < doubles.size(); j++) {
                if (triples.get(i).contains(doubles.get(j).substring(0, 2))
                        || triples.get(i).contains(doubles.get(j).substring(2, 4))) {
                    continue;
                }
                System.out.printf("%s%s ", triples.get(i), doubles.get(j));
                counter++;
            }
        }
        System.out.println(counter + "full houses");
    }
}
