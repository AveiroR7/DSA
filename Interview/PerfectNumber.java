package TopInterview;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String [] args)
    {
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int perfect = 0;
        for(int value = 1; value < number;value++)
        {
            if(number % value == 0)
            {
                sum = sum+value;
            }
        }
        if(sum == number){
            System.out.println("Perfect Number");
        }
        else
        {
            System.out.println("Not Perfect Number");
        }
    }
}
