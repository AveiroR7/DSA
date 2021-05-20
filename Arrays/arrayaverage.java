import java.util.Scanner;

public class arrayaverage {
	
	public static int averageFunc(int arr[])
	{
		int sum=0;
		int avg;
		for(int element=0;element<arr.length;element++)
		{
			sum = sum + arr[element];
		}
		avg= (sum/arr.length);
		return avg;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Size of Array: ");
		Scanner input = new Scanner(System.in);
		int n,avg;
		n = input.nextInt();
		int array[] = new int[n];
		
		
		
		
		System.out.println("Enter The Array: ");
		
		for(int element=0;element<array.length;element++)
		{
			array[element]=input.nextInt();
		}
		
		System.out.println("Entered Elements of The Array: ");
		
		for(int element=0;element<array.length;element++)
		{
			System.out.print(" "+array[element]);
		}
		
		System.out.println(); 
		System.out.println("The Average of The Array: ");
		
		avg = averageFunc(array);
		System.out.print(" "+avg);
		
		
		input.close();
				}

	}


