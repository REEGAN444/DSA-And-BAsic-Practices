public class outer
{
 private static int data=30;
  
 void display()
 {
  class localinner
  {
   void msg()
   {
     System.out.println("Hello");
   }
  }
  localinner in=new localinner();
  in.msg();
 } 

 public static void main(String args[])
 {
  outer n=new outer();
  n.display();
 }
}