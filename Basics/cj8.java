import java.util.*;

class cj8
{
 public static void main(String args[])
 {
  int org,n,rev;
   
  Scanner  s=new Scanner(System.in);
  System.out.print("Enter the number:");
  n=s.nextInt();
  org=n;
  rev=0;
  
  while(n!=0)
  {
   int digit=n%10;
   rev=rev*10+digit;
   n/=10;
  }
  
  if(org==rev)
  {
   System.out.println("The number "+org+" is palindrome");
  }
  else
  {
   System.out.println("The number "+org+" is not a palindrome");
  }
 }
}