
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Stack;

public class Task02SimpleLoops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<BigInteger> fibonaccis = new Stack<>();
        int len = 3;
        fibonaccis.add(sc.nextBigInteger());
        fibonaccis.add(sc.nextBigInteger());
        fibonaccis.add(sc.nextBigInteger());
        int n = sc.nextInt();
        for (int i = 0; i < n - 3; i++) {

            fibonaccis.add(fibonaccis.get(len - 3).add(fibonaccis.get(len - 2).add(fibonaccis.get(len - 1))));
            len++;
        }

        System.out.println(fibonaccis.get(n-1));
    }

}
