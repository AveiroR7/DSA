package TopInterview;

import java.util.Scanner;

public class SumNaturalNumber {

    public static void main(String args[])
    {
        int sum=0;
        System.out.println("Enter the Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int value = 0; value <=number;value++)
        {
            sum = sum+value;
        }
        System.out.println(sum);
    }
}
