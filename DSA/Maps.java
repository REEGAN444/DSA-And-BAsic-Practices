package DataStructure;
import java.util.*;


public class Maps {

	public static void studMark()
	{
		Map<String,List<Integer>> smap =new HashMap<String,List<Integer>>();
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no of Student:");
		int stud=s.nextInt();
		
		System.out.print("Enter no of Subjects:");
		int sub=s.nextInt();
		
		for(int i=1;i<=stud;i++)
		{
			System.out.print("Enter name "+i+":");
			String name=s.next();
			List<Integer> list=new ArrayList<Integer>();
			for(int j=1;j<=sub;j++)
			{
				System.out.print("Enter sub "+j+"mark :");
				list.add(s.nextInt());
			}
			
			smap.put(name, list);
		}
		
		
		for(String i:smap.keySet())
		{
			System.out.println("\n------------------------------------------------------------------------");
			System.out.print(i+"|");
			for(int j=0;j<sub;j++)
			{
				System.out.print(" "+smap.get(i).get(j)+" |");
			}
			
		}
		
		System.out.println();
		System.out.println("------------------------------------------------------------------------");
	} 
	
	public static void freqUsingMap()
	{
		Map<Integer,Integer> m=new HashMap<>();
		int max=0,key=0;
		int arr[]= {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
		
		for(int i:arr)
		{
			m.put(i, m.getOrDefault(i, 0)+1);
			int temp=m.get(i);
			if(temp>max)
			{
				max=temp;
				key=i;
			}
		}
		
		
		System.out.println(m);
		
		System.out.println(key);
		
		
	}
	public static void main(String args[])
	{
		freqUsingMap();
	}
}
