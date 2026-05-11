package DataStructure;

class Nodes
{
	Nodes left;
	Nodes right;
	int data;
	
	Nodes(int data)
	{
		this.data=data;
	}
}

class BinaryTree
{
	Nodes head;
	
	void insertNode(int data)
	{
		head=insertRec(head,data);
		
	}
	
	Nodes insertRec(Nodes root,int data)
	{
		if(root==null)
		{
			root=new Nodes(data);
		}
		else if(data<root.data)
		{
			root.left=insertRec(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=insertRec(root.right,data);
		}
		
		return root;
	}
	
	void inorder(Nodes temp)
	{
		
		if(temp == null) return ;
		
		inorder(temp.left);
		System.out.print(temp.data+" ");
		inorder(temp.right);
	}
	
	void preorder(Nodes temp)
	{
		if(temp==null) return;
		
		System.out.print(temp.data+" ");
		preorder(temp.left);
		preorder(temp.right);
		
	}
	
	void postorder(Nodes temp)
	{
		if(temp==null) return ;
		
		postorder(temp.left);
		postorder(temp.right);
		System.out.print(temp.data+" ");
	}
	
}


public class BinarySearchTree {
	
	
	public static void main(String args[])
	{
		BinaryTree bt=new BinaryTree();
		bt.insertNode(5);
		bt.insertNode(6);
		bt.insertNode(1);
		bt.insertNode(2);
		bt.insertNode(3);
		
		System.out.println("INORDER");
		bt.inorder(bt.head);
		System.out.println("\nPREORDER");
		bt.preorder(bt.head);
		System.out.println("\nPOSTORDER");
		bt.postorder(bt.head);
		
	}
	
	

}
