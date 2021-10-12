package Array;
import java.util.Scanner;
public class FindUnique {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int size = input.nextInt();

        int[] arr = new int[size];
        for (int index = 0; index < size; index++)
        {
            arr[index] = input.nextInt();
        }
        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = 0;i<size;i++)
        {
            int count = 0;
            for(int j=0;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                System.out.print("Unique : "+arr[i]);
            }
        }

    }
}