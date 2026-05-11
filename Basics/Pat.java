import java.util.*;

class Pat
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n;
  System.out.println("Enter number:");
  n=s.nextInt();
  for(int i=n;i>0;i--)
  {
   for(int j=1;j<=i;j++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
  
  for(int a=1;a<=n;a++)
  {
   for(int b=1;b<=a;b++)
   {
    System.out.print("*");
   }
   System.out.println();
  }
 }
}