//program to check wheather a number prime number or not
import java.util.*;

class cj13
{

 static void prime(int n)
 { 
  int num=n,count=0;
  for(int i=1;i<=num;i++)
  {
   if(num%i==0)
   {
    count++;
   }
  }
  if(count==2)
  { 
   System.out.println("THe given is prime number"); 
  }
  else 
  {
   System.out.println("The given is not a prime number");
  }
 }
 public static void main(String args[])
 { 
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the number:");
  int k=s.nextInt();
  prime(k);
 }
}