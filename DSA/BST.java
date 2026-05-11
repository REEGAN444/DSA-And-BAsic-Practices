package DataStructure;



class Node{
	int val;
	Node right;
	Node left;
	
	Node(int val)
	{
		this.val=val;
	}
	
}
public class BST {
	
	Node root;
	
	BST(Node val)
	{
		root=val;
	}
	
	Node insert(Node root,int val)
	{
		if(root==null)
		{
			root=new Node(val);
		}
		
		
		if(val< root.val)
		{
			root.left=insert(root.left,val);
		}
		else if(val>root.val)
		{
			root.right=insert(root.right,val);
		}
		
		return root;
	}
	
	
	void inOrder(Node root)
	{
		
		if(root != null)
		{
			inOrder(root.left);
			System.out.print(root.val+" ");
			inOrder(root.right);
		}
	}
	
	void preOrder(Node root)
	{
		
		if(root!=null)
		{
			System.out.print(root.val+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	void postOrder(Node root)
	{
		if(root != null)
		{
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.val+" ");
		}
	}
	public static void main(String args[])
	{
		BST tree=new BST(new Node(90));
		tree.insert(tree.root, 100);
		tree.insert(tree.root, 70);
		tree.insert(tree.root, 12);
		tree.insert(tree.root, 77);
		tree.insert(tree.root, 88);
		tree.insert(tree.root, 44);
		
		System.out.println("----------INORDER-------------");
		tree.inOrder(tree.root);
		System.out.println("\n-----------------------------\n----------PREORDER------------");
		tree.preOrder(tree.root);
		System.out.println("\n-----------------------------\n----------POSTORDER-----------");
		tree.postOrder(tree.root);
		
	}				
}
