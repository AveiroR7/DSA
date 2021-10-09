package TopInterview;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String... args){

        int number;

        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if(number % 2 == 0)
        {
            System.out.println(number+" is Even");
        }
        else
        {
            System.out.println(number+" is Odd");
        }
    }
}
