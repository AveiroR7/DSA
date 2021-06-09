import java.util.*;
public class ArrayOne {


	public static void main(String[] args) {
		int key;
		int element,del,element1,element2,element3;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Size :");
		int size = input.nextInt();
		int array[] = new int[size];
		
	
		for(element=0;element<size;element++)
		{
			System.out.println("Enter the element : ");
			array[element]= input.nextInt();
		}
		
		System.out.println("The Entered elements are : ");
		
		System.out.println("========================");
		
		for(int index : array)
		{
			System.out.println(index+" ");
		}
		
		System.out.println("========================");
		
		
		
		System.out.println("Enter the Element to Search :");
		key = input.nextInt();
		
		//System.out.println("Key is :" +key);
		int flag = 0;
		for(element1 =0;element1<=size-1;element1++)
		{
			if(array[element1] == key)
			{

				flag++;
			}
		
		}
		
		if(flag == 1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
	
	
	
		System.out.println("========================");
		System.out.println("Enter the deleting value: ");
		del = input.nextInt();
		
		
		System.out.println("========================");
		for(element2=0;element2<size;element2++)
		{
			if(array[element2]==del)
			{
				
				array[element2] = array[element2]+1;
				continue;
			}
			else
			{
				System.out.print(array[element2]);
			}
			
		}
		System.out.println("========================");
	
		
		
		
	}
}


	

