import java.util.*;


class cj27
{
 public static void main(String args[])
 {
  int n;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the number:");
  n=s.nextInt();
  int c=0;
  
  for(int i=n;i>=1;i--)
  {
   for(int j=1; j<=i;j++)
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
 