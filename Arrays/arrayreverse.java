import java.util.Scanner;

public class arrayreverse
{
	
	public static void reverse(int b[])
	{
		System.out.println("The Reversed Array is :");
		
		for(int i=b.length-1;i>=0;i--) 
		{
			System.out.print(b[i]+ " ");	
		}		
		
	}

	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int a[] = new int[10];
				
		System.out.println("Enter the Array: ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]= input.nextInt();		
		}
		
		System.out.println("The Entered Array is :");
		
		
		for(int i=0;i<a.length;i++) 
		{
			System.out.print(a[i]+ " ");	
		}
		System.out.println();
		
		reverse(a);
		
		input.close();
		
		
		
		
		
		
	}

}
