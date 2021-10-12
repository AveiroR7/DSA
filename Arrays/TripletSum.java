package Array;

import java.util.Scanner;

public class TripletSum {

    public static  void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int triplet = 0;
        int pair= 0;
        System.out.println("Enter the Size of an Array : ");
        int size = input.nextInt();
        System.out.println("Enter the Sum : ");
        int sum = input.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter the Elements: ");

        for(int index = 0;index < size; index++)
        {
            arr[index] = input.nextInt();
        }



        for( int value : arr)
        {
            System.out.print(value+" ");
        }
        System.out.println();

        for(int i = 0; i < size;i++)
        {
            for(int j = i+1; j<size;j++)
            {
                for(int k = j+1; k< size; k++)
                {
                    triplet = arr[i]+arr[j]+arr[k];
                    if(triplet == sum)
                    {
                        pair++;
                    }
                }
            }
        }

        System.out.println(pair);


    }
}
