package JavaSyntaxHW;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02TriangleArea {
    /*Write a program that enters 3 points in the plane (as integer x and y coordinates),
     calculates and prints the area of the triangle composed by these 3 points. 
     Round the result to a whole number. In case the three points do not form a triangle,
     print "0" as result. */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String[] coords = input.nextLine().split(" ");
            points.add(Integer.parseInt(coords[0]));
            points.add(Integer.parseInt(coords[1]));
        }

        float area = (points.get(0) * (points.get(3) - points.get(5))
                + points.get(2) * (points.get(5) - points.get(1))
                + points.get(4) * (points.get(1) - points.get(3))) / 2;
        
        if (area < 0) {
            System.out.printf("%.0f\n", -area);
        } else {
            System.out.printf("%.0f\n", area);
        }
    }

}
