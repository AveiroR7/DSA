package linkedList;

import java.util.Scanner;

public class linkedlistuse 
{

	public static Node<Integer> ll()
	 { 
		 Node <Integer> n1 = new Node<>(10);
		 Node <Integer> n2 = new Node<>(20); 
		 Node <Integer> n3 = new Node<>(30);
		 Node <Integer> n4 = new Node<>(40);	 
		 n1.next = n2; 
		 n2.next = n3; 
		 n3.next = n4;
		 return n1; 
	 }
	 
	public static int length(Node<Integer> head)
	{
		int count =0;
		Node <Integer> temp = head;
		
		while(temp !=null)
		{
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	
	 public static void print(Node <Integer> head)
	 { 
		 Node<Integer> temp = head;
	 
		 while(temp != null)
		 {
			 System.out.print(temp.data+"-->");
			 temp= temp.next;
		 }
		 System.out.println();
	 
	 }
	 
	 public static void find(Node <Integer> head,int i)
	 {
		 Node <Integer> temp = head;
		 int count = 0;
		
		 String current = null;
		 while(count < i && current != null) {
			 System.out.println();
		 }
	 }
	 
	 public static void insertAt(int pos,int value)
	 {
		 
	 }
	 
	 public static Node<Integer> customInput(){
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the Elements : ");
		 int data = input.nextInt();
		 Node <Integer> head = null;
		 while(data != -1)
		 {
			
			Node <Integer> currentNode = new Node<Integer>(data);
			 data = input.nextInt();
			 
			 if(head == null)
			 {
				 head = currentNode;
			 }
			 else
			 {
				 Node <Integer> tail = head;
				 while(tail.next != null)
				 {
					 tail = tail.next;
				 }
				 
				 tail.next = currentNode;
				 
			 }
		 }
		return head;
		
		 
	 }
	 
	 
	public static void main(String[] args)
	{
		Node<Integer> node = customInput();
		System.out.println("The LinkedList : ");
		print(node);
		System.out.println("The Number of Nodes is " +length(node));
	}

}
