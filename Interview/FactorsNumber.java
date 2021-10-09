package TopInterview;

import java.util.Scanner;

public class FactorsNumber {

    public static void main(String args [])
    {
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for(int value = 1; value <= number; value++)
        {
            if(number% value == 0)
            {
                System.out.print(value+" ");
            }
        }
    }
}
