import java.util.*;

class cj24
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int c=0,n;
  System.out.print("Enter the number:");
  n=s.nextInt();
  
  for(int i=1;i<=n;i++)
  {
   for(int j=1;j<=n-i;j++)
   {
    System.out.print(" ");
   }
   c++;
   for(int k=1;k<=c;k++)
   {
    System.out.print("*");
   }
  System.out.println();
  }

 
 }
}