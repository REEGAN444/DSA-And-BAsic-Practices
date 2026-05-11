import java.util.*;

class cj11
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n,count=0;
  System.out.print("Enter N:");
  n=s.nextInt();
  for(int i=2;i<n;i++)
  {
   if(i%n==0)
   {
    count=count+1;
   }
  }
  if(count>=1)
  {
   System.out.println("The given Number "+n+" is the prime number");
  }
  else
  {
   System.out.println("The given Number "+n+" is  Not the prime number");
  }
 }
}