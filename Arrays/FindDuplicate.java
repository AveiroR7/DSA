package Array;

import java.util.Scanner;

public class FindDuplicate {

    public static void main(String [] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the Elements: ");
        for(int index = 0; index < size;index++)
        {
            arr[index] = input.nextInt();
        }
        System.out.println();

        for(int index=0;index<size;index++)
        {
            int count= 0;
            for(int newIndex=0;newIndex<size;newIndex++)
            {
                if(arr[index] == arr[newIndex])
                {
                    count++;
                }
            }
            if(count != 1)
            {
                System.out.println(arr[index]);
                break;
            }
        }

    }
}
