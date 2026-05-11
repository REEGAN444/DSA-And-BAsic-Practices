class Stack
{
 int top,size=5,data;
 int Item[]=new int[size];
  Stack()
  {
   top=0;
  }


 void push(int i)
 {
  if(top==size)
  {
    System.out.println("There is no space");
  }
  else
  {
   data=i;
   Item[top]=data;
   top++;
  }
 } 

 void pop()
 {
  if(top==-1)
  {
   System.out.println("The stack is empty");
  }
  else
  {
  System.out.println(Item[top]+"poping..");
  top--;
  }
 }

 void print()
 {
  
 }
}



class ji
{
 public static void main(String args[])
 {
  Stack k=new Stack();
  k.push(10);
  k.push(20);
  k.pop();

 
 }
}