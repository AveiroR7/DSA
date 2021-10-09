package TopInterview;

import java.util.Scanner;

public class ReverseNumber{

    public static void main(String ... args)
    {
        System.out.print("Enter the Number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String str = "";
        int reverse;
        while(number != 0)
        {
            reverse = number % 10;
            str = str + Integer.toString(reverse);
            number = number/10;
        }

        System.out.print("Reverse of the Number is "+str);

    }
}