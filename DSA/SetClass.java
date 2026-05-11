package DataStructure;
import java.util.*;
public class SetClass {
	public static void main(String args[])
	{
		Set<Integer> s=new HashSet<Integer>();//store Unique
		
		s.add(1);
		s.add(1);
		s.add(2);
		s.add(3);
		
		System.out.println(s);
		
		
		Set<Integer> e=new TreeSet<Integer>();//sorted and unique
		
		e.add(3);
		e.add(2);
		e.add(1);
		e.add(1);
		
		System.out.println(e);
		
		Iterator i=e.iterator(); // looping
		
		while(i.hasNext())
			System.out.print(i.next()+" ");
	}

}
