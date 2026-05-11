import java.util.*;

class Triangle
{
 public static void main(String args[])
 {
  int a,b,c;
  
  Scanner s=new Scanner(System.in);

  System.out.print("Enter A=");
  a=s.nextInt();
  System.out.print("Enter B=");
  b=s.nextInt();
  System.out.print("Enter C=");
  c=s.nextInt();
  
  if(c<(a+b)||a<(a+b)||b<(a+c))
  {
    System.out.println("The Triangle will created");
  }
  else
  {
  System.out.println("No possible of triangle");
  }
 
  
  
  
 }
}