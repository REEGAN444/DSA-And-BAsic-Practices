import java.util.*;

class cj29
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n,c=0;
  
  System.out.print("Enter the number:");
  n=s.nextInt();
  
  for(int i=n-1;i>=1;i--)
  {
   for(int j=1;j<=i;j++)
   {
   System.out.print(" ");
   }
    c++;
   for(int k=1;k<=(2*c)-1;k++)
   {
    System.out.print("*");
   }

   System.out.println();
  }

 }
}