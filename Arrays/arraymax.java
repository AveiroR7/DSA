import java.util.Scanner;

public class arraymax {
	
	public static int maxFunction(int arr[])
	{
		int max=0;
		for(int element=0;element<arr.length;element++)
		{
			if(arr[element]>=max)
			{
				max = arr[element];
			}
			
		}
		
		return max;
		
	}
	
	public static void main(String[] args)
	{
		
			Scanner input = new Scanner(System.in);
		
			int array[] = new int[5];
		
			System.out.println("Enter the Array: ");
		
			for(int element=0;element<array.length;element++)
				{
					array[element]= input.nextInt();
				}
		
			System.out.println("Entered elements of Array: ");
		
			for(int element=0;element<array.length;element++)
				{
					System.out.print(array[element]+"  ");
				}
			System.out.println();
			
			System.out.print("The Max value of  the Array:");
			
			int a =maxFunction(array);
			System.out.println(" "+a);
						
			
			
			input.close();
	}

}
