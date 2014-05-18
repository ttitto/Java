package LoopsMethodsClassesHW;

import java.io.BufferedReader;
import java.io.FileReader;

public class Task08SumNumbersFromFile {
    /*Write a program to read a text file "Input.txt" holding a sequence of
     integer numbers, each at a separate line. Print the sum of the numbers at the console.
     Ensure you close correctly the file in case of exception or in case of normal execution.
     In case of exception (e.g. the file is missing), print "Error" as a result. Examples:*/

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("..\\numbers1.txt"))) {//change filename to numbers2 and 3 to check other tests
            String line = br.readLine();
            int sum=0;
            while (line!=null) {
                int num=Integer.parseInt(line);
                 sum=addNumber(sum, num);
                line=br.readLine();
            }
            
            System.out.printf("%s\n",sum);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
    private static int addNumber(int sum, int num){
        return sum+num;
    }
}
