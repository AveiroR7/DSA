//Java program to calculate sum of digits of a number
package TopInterview;

import java.util.Scanner;

public class SumOfDigits {


    public static void main(String [] args)
    {
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum=0;
        while (number != 0)
        {
            int last = number % 10;
            sum = sum+last;
            number = number/10;

        }
        System.out.print("Sum of Digits: "+sum);
    }

}
