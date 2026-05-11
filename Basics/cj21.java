import java.util.*;
 

class cj21
{
 public static void main(String args[])
 {
  int n;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the number:");
  n=s.nextInt();
  
   for (int i = 1; i <= n; i++)
        {
            for (int j = n; j > i; j--) 
  	     {
                System.out.print("/");
             }
            for (int k = 1; k <= (2 * i - 1); k++)
	    {
                System.out.print("*");
            }
          System.out.println();
        }
 for (int i = n-1; i >=1; i--)
        {
            for (int j = n; j > i; j--) 
  	     {
                System.out.print(" ");
             }
            for (int k = 1; k <= (2 * i - 1); k++)
	    {
                System.out.print("*");
            }
          System.out.println();
	}

 }
}