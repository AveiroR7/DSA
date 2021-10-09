package TopInterview;

import java.util.Scanner;

public class Armstrong {

    public static void main(String [] args)
    {
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        int armStrong;
        int num = number;

        while(num != 0 )
        {
            armStrong = num % 10;
            sum = sum+ (armStrong*armStrong*armStrong);
            num = num/10;
        }


        if(sum == number)
        {
            System.out.println("ArmStrong Number");
        }
        else
        {
            System.out.println("Not ArmStrong Number");
        }
    }
}
