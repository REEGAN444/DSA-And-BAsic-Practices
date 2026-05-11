package DataStructure;

public class MaxFreq {
	static  String  Find(String k)
	{
		int freq[]=new int[128];
		
		for(char i:k.toCharArray())
		{
			freq[i]++;
		}
		
		StringBuilder sb=new StringBuilder();
		
		while(true)
		{
			int max=0;
			int ind=0;
			
			for(int i=0;i<128;i++)
			{
				if(freq[i]>max)
				{
					max=freq[i];
					ind=i;
				}
			}
			
			sb.repeat((char)ind, max);
			
			freq[ind]=0;
			
			if(max==0) break;
		}
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		System.out.println(Find("iedcba"));
	}

}
