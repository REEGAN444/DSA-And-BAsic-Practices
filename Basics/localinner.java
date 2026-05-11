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
  localinner in=-new localinner();
  in.msg();
 } 

 public static void main(String args[])
 {
  localouter n=new localouter();
  n.display();
 }
}