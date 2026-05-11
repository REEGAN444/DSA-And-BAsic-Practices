package DataStructure;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

   class Graphic {
	static List<List<Integer>> g = new ArrayList();

	Graphic(int v) {
		for (int i = 0; i < v; i++) {
			g.add(new ArrayList<Integer>());
		}
	}

	public void inserting(int a, int b) {
		if (a < g.size() && b < g.size()) {
			g.get(a).add(1);
			g.get(b).add(1);
		} else {
			System.out.println("No vertex is Inserted");
		}
	}

	public void display() {
		for (int i = 0; i < g.size(); i++) {
			System.out.println(i + " : " + g.get(i));
		}
	}

	public void bfsTraversal(int a) {
		java.util.Queue<Integer> q = new LinkedList<>();

		boolean vis[] = new boolean[g.size()];

		q.add(a);
		vis[a] = true;

		while (q.size() != 0) {
			int ver = q.remove();
			System.out.print(ver + " ");

			for (int i = 0; i < g.get(ver).size(); i++) {
				int av = g.get(ver).get(i);
				if (!vis[av]) {
					q.add(av);
					vis[av] = true;
				}

			}
		}
	}

	public void noOfIslands()
	{
	    int count = 0;

	    for(int i = 0; i < g.size(); i++)
	    {
	        for(int j = 0; j < g.get(i).size(); j++)
	        {
	            if(g.get(i).get(j) == 1)
	            {
	                count++;
	                dfs(g, i, j);
	            }
	        }
	    }

	    System.out.println("count = " + count);
	}


	public static void dfs(List<List<Integer>> g2, int a, int b)
	{
	    // boundary + water check
	    if(a < 0 || b < 0 || a >= g2.size() || b >= g2.get(a).size() || g2.get(a).get(b) == 0)
	        return;

	    // mark visited
	    g2.get(a).set(b, 0);

	    // explore 4 directions
	    dfs(g2, a-1, b); // up
	    dfs(g2, a+1, b); // down
	    dfs(g2, a, b-1); // left
	    dfs(g2, a, b+1); // right
	}
//	public static void dfs(List<List<Integer>> g2,int a,int b)
//	{
//		
//		if(a < 0 || b < 0 || a >= g.size() || b >= g.get(0).size() || g.get(a).get(b) == 0)
//	        return;
//		g2.get(a).set(b,0);
//		dfs(g2,a-1,b);
//		dfs(g2,a+1,b);
//		dfs(g2,a,b+1);
//		dfs(g2,a,b-1);
//		
//		
//	}
}

public class GraphPractice {
	public static void main(String args[]) {

		Graphic ss = new Graphic(5);
		
		ss.inserting(0, 0);
		ss.inserting(0,1);
		ss.inserting(1,0);
		ss.inserting(0, 3);
		ss.inserting(0, 4);
		ss.inserting(1,4);
		ss.inserting(3, 0);
		ss.inserting(3,4);
		ss.inserting(4, 0);
		ss.inserting(4, 1);
		ss.inserting(4, 3);
		ss.inserting(4, 4);
//		ss.inserting(0, 1);
//		ss.inserting(1, 2);
//		ss.inserting(2, 3);
//		ss.inserting(3, 4);
//		ss.inserting(4, 0);
//		ss.display();
//
//		ss.bfsTraversal(0);
//		System.out.println();
//		ss.dfsTraversal(0);
		ss.noOfIslands();

	}

}
