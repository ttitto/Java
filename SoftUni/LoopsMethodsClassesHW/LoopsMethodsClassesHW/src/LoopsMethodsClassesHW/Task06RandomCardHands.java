package LoopsMethodsClassesHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task06RandomCardHands {
    /*Write a program to generate n random hands of 5 different cards form a standard
     suit of 52 cards. Examples:*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        String[] cards = new String[52];
        List<String> hand = new ArrayList<>();

        for (int f = 0, cnt = 0; f < 13; f++) {
            for (int s = 0; s < 4; s++, cnt++) {
                cards[cnt] = Task03FullHouse.faces[f] + Task03FullHouse.suits[s];
            }
        }

        int handsNum = input.nextInt();
        for (int i = 0; i < handsNum; i++) {
            for (int c = 0; c < 5; c++) {
                String card = cards[rnd.nextInt(52)];
                if (!hand.contains(card)) {
                    hand.add(card);
                    continue;
                }
                c--;
            }
            System.out.println(hand);
            hand.clear();
        }

    }
}
