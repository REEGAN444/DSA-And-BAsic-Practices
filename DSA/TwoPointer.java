package DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class TwoPointer {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		String str="aaaiaaaaaaeaaaaa";
		
		char[] arr=str.toLowerCase().toCharArray();
		List<Character> ls=new ArrayList<>();
		ls.add('a');
		ls.add('e');
		ls.add('i');
		ls.add('o');
		ls.add('u');
		
		int i=0,j=arr.length-1;
		
		while(i<j)
		{
			if(!ls.contains(arr[i]))
			{
				i++;
				continue;
			}
			if(!ls.contains(arr[j]))
			{
				j--;
				continue;
			}
			
			
				char temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			
				
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
