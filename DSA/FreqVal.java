package DataStructure;

import java.util.Scanner;

public class FreqVal {

	static Scanner s=new Scanner(System.in);
	static void freq()
	{
		int arr[]=new int[1000];
		System.out.print("Enter N:");
		int n=s.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Number "+(i+1)+":");
			
			arr[s.nextInt()]++;
		}
		
		
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i>0)
			{
				temp=arr[i];
			
			for(int j=0;j<temp;j++)
			{
				System.out.print(i);
			}
			}
		}
	}
	
	
	public static void main(String args[])
	{
		freq();
	}
}
