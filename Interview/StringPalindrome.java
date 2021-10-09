package TopInterview;

import java.util.Scanner;

public class StringPalindrome{
    public static void main(String ... args)
    {
        System.out.println("Enter the String : ");
        Scanner input = new Scanner(System.in);
        String text = input.next();
        String reverse = "";
        int len = text.length();
        for(int value=0; value < len; value++)
        {
            char temp = text.charAt(value);
            reverse = temp+reverse;
        }
        if(text.equals(reverse))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}