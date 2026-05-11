import java.util.*;
class cj25
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the number:");
  int n=s.nextInt();
  for(int i=1;i<=n;i++)
  {
   if(i==1||i==n)
   {
    for(int j=1;j<=n;i++)
    {
     System.out.print("*");
    } 
    System.out.println();
   }
   else if(i==2 && i<n)
   {
    for(int i=1;i<=n;i++)
    {
     if(int j==1&&j==n)
     {
       System.out.print("*");
     } 
     else
     {
       System.out.print(" ");
     }
    }
   }
  }
 }
}