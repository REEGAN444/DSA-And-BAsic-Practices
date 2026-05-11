package DataStructure;
import java.util.*;


class Graph{
	Scanner s=new Scanner(System.in);
	
	List<List<Integer>> list=new ArrayList<>();
	Graph(int val)
	{
		for(int i=0;i<val;i++)
		{
			list.add(new ArrayList<Integer>());
		}
	}
	
	void getGraph(int a, int b)
	{
	    if(a < list.size() && b < list.size())
	    {
	        list.get(a).add(b);
	        list.get(b).add(a);
	    }
	    else
	    {
	        System.out.println("Invalid vertex number");
	    }
	}
 	
	void printGraph()
	{
		for(int i=0;i<list.size();i++)
		{
			System.out.println("Graph Vertex "+i+": "+list.get(i));
			System.out.println();
		}
	}
	
	void addWithLinearEdge()
	{
		System.out.print("Enter Number of Edges :");
		int n=s.nextInt();
		Graph g=new Graph(n);
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter vertex:");
			int vertex=s.nextInt();
			System.out.print("Enter Neighbour:");
			int neighbour=s.nextInt();
			
			g.getGraph(vertex, neighbour);
			
		}
		
	}
	
	void bfs(int a)
	{
		Queue<Integer> q=new LinkedList<>();
		boolean visited[]=new boolean[list.size()];
		
		q.add(a);
		visited[a]=true;
		
		while(q.size()!=0)
		{
			int vertex=q.remove();
			
			System.out.print(vertex+" ");
			for(int i=0;i<list.get(vertex).size();i++)
			{
				int av=list.get(vertex).get(i);
				if(!visited[av])
				{
					q.add(av);
					
					visited[av]=true;
				}
			}
		}
		System.out.println();
		
	}

	void dfs(int a)
	{
		java.util.Stack<Integer> st=new java.util.Stack<>();
		boolean visited[]=new boolean[list.size()];
		
		st.add(a);
		
		visited[a]=true;
		
		while(st.size() != 0)
		{
			int vertex=st.pop();
			
			System.out.print(vertex+" ");
			for(int i=0;i<list.get(vertex).size();i++)
			{
				int av=list.get(vertex).get(i);
				
				if(!visited[av])
				{
					st.add(av);
					visited[av]=true;
				}
			}
		}
		System.out.println();
	} 
	
	
	public void printAdjMatrix()
	{
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<list.get(i).size();j++)
			{
					System.out.print("*");
				
			}
			System.out.println();
			
		}
	}
}
public class GraphDataStructure {
	
	public static void main(String args[])
	{
		Graph g=new Graph(4);
		g.getGraph(0,1);
		g.getGraph(1,2);
		g.getGraph(2,3);
		g.getGraph(3,1);
		
		g.printAdjMatrix();
		
		g.dfs(0);
		g.bfs(0);
		
		
		
	}

}
