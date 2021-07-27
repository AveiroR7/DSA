package Integer;
import java.util.*;
public class FizzBuzz {

    public static void FizzBuzz(int value){
        for(int element= 1;element <= value;element++)
        {
            if(element % 5 == 0 && element % 3 == 0)
            {
                System.out.println("FizzBuzz");

            }
            else if(element % 5 == 0 )
            {
                System.out.println("Buzz");
            }
            else if(element % 3 == 0 )
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(element);
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        FizzBuzz(number);

    }
}
