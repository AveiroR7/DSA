import java.util.*;

class stack1{
	
	private int size;
	private int s[];
	private int top;
	
	
	public void isEmpty()
	{
		if(top==-1)
		{
			System.out.println("Stack is Underflow");
		}
	}
	
	public void isFull()
	{
		if(top == size -1)
		{
			System.out.println("Stack is Overflow");
		}
	}
	
	
	public void peek() {
		System.out.println("Top is : "+s[top]);
	}
	
	public void push(int insert) {
			s[++top] = insert;
			System.out.println(insert);
	}

	public int pop() 
	{
		return s[top--];
	}
	
	
	public void display()
	
	{
		for(int i=0;i<size;i++)
		{
			System.out.println(s[i]);
		}
	}
	
	public stack1(int size) {
		this.size = size;
		s = new int[size];
		top = -1;
	}
	
}
public class stack {

	public static void main(String[] args) {
	
		stack1 sa = new stack1(5);
		
		sa.push(1);
		sa.push(2);
		sa.push(3);
		sa.push(25);
		sa.pop();
		sa.peek();
		
	
		

	}

}
