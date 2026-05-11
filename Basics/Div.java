import java.util.*;

class Div
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  
  int a;
  System.out.print("Enter the Number:");
  a=s.nextInt();
 
  if(a%15==0)
  {
   System.out.println("Bye");
  }
  else if(a%3==0)
  {
   System.out.println("Hi");
  }
  else if(a%5==0)
  {
   System.out.println("Hello");
  }
 }
}