package TopInterview;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String ... args){
        System.out.println("Enter the Number: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number > 0)
        {
            System.out.println(number+" is Positive");
        }
        else if(number<0)
        {
            System.out.println(number+" is Negative");
        }
        else
        {
            System.out.println(number+" is Zero");
        }
        input.close();
    }


}
