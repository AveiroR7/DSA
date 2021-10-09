package TopInterview;
import java.util.Scanner;
public class Factorial {

    public static void main(String args[])
    {
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 1;
        for(int value = number; value >= 1;value--)
        {
            sum = sum*value;
        }
        System.out.println(sum);
    }
}
