import java.util.*;

class cj22
{
 public static void main(String args[])
 {
 int c=0,n;
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the number:");
 n=s.nextInt();

 for(int i=n;i>=1;i--)
 {
  for(int j=i;j<=n;j++)
  {
   System.out.print(" ");
  }
  
  for(int k=1;k<=n-c;k++)
  {
   System.out.print("*");
  }
  c++;
  System.out.println();
 }
 
 }
}