class Stack
{ 
 int top,capacity,i=0;  

 Stack(int size)
 {
  int a[]=new int[size];
  top=-1;
  capacity=size;
 }

  
 void push(int item)
 {
  if()
  {
   System.out.println("The element is not appendable");
   System.exit(1);
  }
  System.out.println("The elemet is appending");
  a[++top]=item;
 }


 int pop()
 {
  if(top==-1) 
  {
   System.out.println("The stack is empty");
   System.exit(1);
  }
  System.out.println("The element is poping");
  return a[top--];
 }


 int printall()
 {
  System.out.println("The stack:");
  for(i=0;i<top;i++) 
  {
   System.out.println(a[i]);
  }
 }
  
  
}


class p1
{
 public static void main(String args[])
 {
  Stack k=new Stack(5);
  

  k.push(3);
  k.printall();
 }
}