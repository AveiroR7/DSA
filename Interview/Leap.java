package TopInterview;

import java.util.Scanner;

public class Leap {

    public static void main(String args [])
    {
        System.out.println("Enter the Year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0))
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap year");
        }


    }
}