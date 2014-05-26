package examsample;
import java.util.HashMap;
import java.util.Scanner;

public class Task04MagicCarsNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> letterValues = new HashMap() {
            {
                put('A', 10);
                put('B', 20);
                put('C', 30);
                put('E', 50);
                put('H', 80);
                put('K', 110);
                put('M', 130);
                put('P', 160);
                put('T', 200);
                put('X', 240);
            }
        };
        int magicNum = Integer.parseInt(sc.nextLine());


    }

}
