package DataStructure;

import java.util.Arrays;

public class Anagram {
	
	static boolean anagram(String a ,String b)
	{
		int alpha[]=new int[26];
		
		if(a.length()!=b.length())return false;
		
		for(char s : a.toCharArray())
		{
			alpha[s-'a']++;
		}
		
		for(char h : b.toCharArray()) 
		{
			alpha[h-'a']--;
		}
		
		for(int  j : alpha)
		{
			if(j!=0)
			{
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String args[])
	{
		System.out.println(anagram("regean","reegan"));
	}
}
