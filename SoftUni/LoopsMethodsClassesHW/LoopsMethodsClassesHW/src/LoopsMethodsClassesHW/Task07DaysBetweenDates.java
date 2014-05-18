package LoopsMethodsClassesHW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task07DaysBetweenDates {
    /*Write a program to calculate the difference between two dates in number of days.
     The dates are entered at two consecutive lines in format day-month-year. 
     Days are in range [1…31]. Months are in range [1…12]. Years are in range [1900…2100].
     Examples:
     Input	Output
     30-11-2014
     27-03-2015	117
     */

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();

        Scanner input = new Scanner(System.in);
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        try {
            start = ft.parse(input.nextLine());
            end = ft.parse(input.nextLine());
        } catch (ParseException ex) {
            System.out.println("Unparsable string: " + ft);
            Logger.getLogger(Task07DaysBetweenDates.class.getName()).log(Level.SEVERE, null, ex);
        }
        long diff = (end.getTime() - start.getTime()) / (1000 * 60 * 60 * 24);
        System.out.println(diff);
    }
}