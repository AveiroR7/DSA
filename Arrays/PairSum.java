package Array;

import java.util.Scanner;

public class PairSum {

    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Size of an Array : ");
        int N= input.nextInt();
        System.out.println("Enter the Sum : ");
        int X = input.nextInt();
        int pair=0;
        int sum=0;
        int arr1[] = new int[N];
        for(int index=0;index<N;index++)
        {
            arr1[index] = input.nextInt();
        }
        for(int i : arr1)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i=0;i<N;i++)
        {
            for(int j=i+1;j<N;j++)
            {
                sum = arr1[i]+arr1[j];
                if(sum  == X)
                {
                   pair++;
                }
            }
        }

        System.out.println(pair);
    }
}
