package DataStructure;


class Node{
	
	int data;
	Node next=null;
	Node prev=null;
	
	Node(int data)
	{
		this.data=data;
		next=null;
		prev=null;
	}
}


class LinkedList 
{
	int data;
	Node temp=null;
	Node head=null;
	void insert(int data)
	{
		
		Node prevtemp=null;
		Node newNode=new Node(data);
		
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			temp=head;
			while(temp.next!=null)
			{
				prevtemp=temp;
				temp=temp.next;
			}
			temp.next=newNode;
			temp.next.prev=prevtemp;
		}
	}
	
	
	void display()
	{
		
		temp=head;
		
		while(temp!=null)
		{
			System.out.println(temp.data+"-->");
			temp=temp.next;
		}
		
	}
}
public class ReverseLinkedList {
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		ll.insert(4);
		ll.display();
	}
}
