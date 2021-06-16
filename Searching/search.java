import java.util.*;
public class search {

  public int binarySearch(int a[], int value)
	{
		int left = 0;
		int right = a.length -1;
		
		while(left <= right)
		{
			int middle = (left+right)/2;
			
			if (a[middle]==value)
			{
				return middle;
			}
			
			if(a[middle] < value)
			{
				left = middle +1;
			}
			else
			{
				right = middle-1;
			}
			
			System.out.println();
			
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
		int x = s.binarySearch(arr,5);		
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
