package JavaSyntaxHW;

import java.util.Locale;
import java.util.Scanner;

public class Task03InsideFigure {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        float figTop = 6;
        float figLeft = 12.5f;
        float figBottom = 13.5f;
        float figRight = 22.5f;

        float emptyTop = 8.5f;
        float emptyLeft = 17.5f;
        float emptyRight = 20f;

        Scanner input = new Scanner(System.in);
        String[] strings = input.nextLine().split(" ");

        float x = Float.parseFloat(strings[0]);
        float y = Float.parseFloat(strings[1]);

        if (
                (x>=figLeft && x<=emptyLeft && y<=figBottom && y>=figTop) ||
                (x>=emptyRight && x<=figRight && y<=figBottom && y>=figTop)  ||
                (x>=emptyLeft && x<=emptyRight && y<=emptyTop && y>=figTop)
                ) {
            System.out.println("Inside");
        } else{
            System.out.println("Outside");
        }
    }
}
