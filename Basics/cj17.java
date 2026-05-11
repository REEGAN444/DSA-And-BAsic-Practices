import java.util.*;


class cj17
{
 public static void main(String args[])
 {
  int n,n2,s=0,r;
   
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter the number:");
  n=sc.nextInt();
  n2=n;
  
  while(n!=0)
  {
   r=n%10;
   System.out.println("Result:"+r);
   s=s+(r*r*r);
   System.out.println("The sum:"+s);
   n=n/10;
  }
  if(s==n2)
  {
   System.out.println("the number is Armstrong");
  }
  else
  {
   System.out.println("The number is not an Armstrong");
  }
  
  
 }
}