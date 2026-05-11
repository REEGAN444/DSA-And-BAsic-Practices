import java.util.*;

class cj20
{
 public static void main(String args[])
 {
   int n;
   Scanner s=new Scanner(System.in);
   System.out.print("Enter the number:");
   n=s.nextInt();
   
   for(int i=n;i>=1;i--)
   {
    for (int j=i;j>=1;j--)
    {
     System.out.print("*");
    }
    System.out.println();
   }
   
 } 
}