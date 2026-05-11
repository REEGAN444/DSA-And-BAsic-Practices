package DataStructure;

public class Stack {
	
	int stack[];
	
	int top=-1;
	int size;
	
	Stack(int val)
	{
		stack=new int[val];
		size=val;
	}
	
	
	void push(int val)
	{
		top++;
		stack[top]=val;
	}
	
	int pop()
	{
		top--;
		
		return stack[top+1];
	}
	
	void printStack()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(" "+stack[i]);
		}
	}
	
	boolean isEmpty()
	{
		 if(top>-1)
		 {
			 return false;
		 }
		 else
		 {
			 return true;
		 }
	}
	
	boolean isFull()
	{
		if(top==size-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Stack s1=new Stack(10);
		for(int i=1;i<=10;i++)
		{
			s1.push(i);
		}
		s1.pop();
	    s1.printStack();
	    
		
	}
}
