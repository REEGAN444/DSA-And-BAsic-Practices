class stack
{int top=6;
 
  void display()
  {
   
   System.out.println(top--);
   System.out.println(top);
  }


}

class make
{
 public static void main(String args[])
 {
 // int s,top=2;
  stack k=new stack();
  k.display();
 
 }
}