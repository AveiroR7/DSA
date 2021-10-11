package Array;

import java.util.Scanner;

public class ArraySum {

    public static void main(String ... args)
    {
        System.out.println("Enter the size of an Array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] array = new int[size];
        int sum=0;

        for(int value=0;value<size;value++)
        {
            array[value] = input.nextInt();
        }

        for(int value=0;value<size;value++)
        {
            System.out.print(array[value]+" ");
            sum=sum+ array[value];
        }
        System.out.println();
        System.out.println("The Sum is "+sum);
    }
}
