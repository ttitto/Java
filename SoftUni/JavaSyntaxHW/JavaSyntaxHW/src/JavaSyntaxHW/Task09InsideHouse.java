package JavaSyntaxHW;

import java.util.Locale;
import java.util.Locale;
import java.util.Scanner;

public class Task09InsideHouse {
    /*Write a program to check whether a point is inside or outside the house below.
    The point is given as a pair of floating-point numbers, separated by a space. 
    Your program should print "Inside" or "Outside". Examples:*/
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        float lRectLeft=12.5f;
        float lRectRight=17.5f;
        float rectTop=8.5f;
        float rectBottom=13.5f;
        float rRectLeft=20f;
        float rRectRight=22.5f;
        
        float topX=17.5f;
        float topY=3.5f;
        
        float pointX=input.nextFloat();
        float pointY=input.nextFloat();
        
        boolean isInsideLeftRect;
        isInsideLeftRect=pointX>=lRectLeft && pointX<=lRectRight &&
                pointY>=rectTop && pointY<=rectBottom;
        boolean isInsideRightRect;
        isInsideRightRect=pointX>=rRectLeft && pointX<=rRectRight &&
                pointY>=rectTop && pointY<=rectBottom;
        boolean isInsideTriangle;
        isInsideTriangle=pointY<=rectTop &&
                //position = sign( (Bx-Ax)*(Y-Ay) - (By-Ay)*(X-Ax) )
                ((topX-lRectLeft)*(pointY-rectTop)-(topY-rectTop)*(pointX-lRectLeft))>=0 &&
                ((topX-rRectRight)*(pointY-rectTop)-(topY-rectTop)*(pointX-rRectRight))<=0;
        
        if (isInsideTriangle || isInsideLeftRect || isInsideRightRect) {
            System.out.println("Inside");
        }else{
            System.out.println("Outside");
        }
    }
    
}
