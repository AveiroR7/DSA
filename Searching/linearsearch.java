import java.util.*;
public class search {
	
	public int linearSearch(int a[], int value)
	{
		for(int element = 0;element < a.length;element++)
		{
			if(value == a[element])
			{
				System.out.println();
				System.out.println("The value to be searched : "+value);
				return value;
			}
			
		}
		return -1;
	}
	

	public static void main(String[] args) {

		int arr[] = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Array Elements: ");
		for(int element = 0; element < arr.length; element++)
		{
			arr[element] = input.nextInt();
		}
		System.out.println("The Entered elements are :");
		for(int element = 0; element < arr.length; element++)
		{
			System.out.print(arr[element]+" ");
		}
		
		search s = new search();
		int x = s.linearSearch(arr,5);		
		if(x == -1)
		{
			System.out.println("The value is not found");
		}
		else
		{
			System.out.println("The value is found");
		}
	}

}
