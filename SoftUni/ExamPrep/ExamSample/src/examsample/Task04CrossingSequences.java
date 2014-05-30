package examsample;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import javax.management.openmbean.SimpleType;

public class Task04CrossingSequences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger temp;
        BigInteger first = sc.nextBigInteger();
        BigInteger second = sc.nextBigInteger();
        BigInteger third = sc.nextBigInteger();
        BigInteger spiralStart = sc.nextBigInteger();
        BigInteger spiralStep = sc.nextBigInteger();
        sc.nextLine();

        HashSet<BigInteger> fibos = new HashSet<>();
        HashSet<BigInteger> spiral = new HashSet<>();

        fibos.add(first);
        fibos.add(second);
        fibos.add(third);

        spiral.add(spiralStart);

        if (spiralStart.equals(first)
                || spiralStart.equals(second)
                || spiralStart.equals(third)) {
            System.out.println(spiralStart);
            return;
        }

        int counter = 0;
        int iteration=0;
        while (spiralStart.longValueExact() <= 1000000
                || third.longValueExact() <= 1000000) {
            counter++;
            if (fibos.contains(spiralStart)) {
                System.out.printf("%s\n", spiralStart);
                return;
            } else if (spiral.contains(third)) {
                System.out.printf("%s\n", third);
                return;
            } else {

                if (spiralStart.longValueExact() <= 1000000) {
                    if (counter % 3 == 0) {
                        iteration++;
                        spiralStart = spiralStart.add(spiralStep.multiply(BigInteger.valueOf(iteration)));
                        counter++;
                    } else {
                        spiralStart = spiralStart.add(spiralStep.multiply(BigInteger.valueOf(iteration)));
                    }
                    spiral.add(spiralStart);
                }

                if (third.longValueExact() <= 1000000) {
                    temp = first;
                    first = second;
                    second = third;
                    third = first.add(second).add(temp);
                    fibos.add(third);
                }
            }
        }
        System.out.println("No");
    }

}
