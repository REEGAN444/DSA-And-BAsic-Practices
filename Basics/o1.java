import java.util.*;

class o1
{
 public static void main(String args[])
 {
  int a,b,c;
  
  Scanner sc =new Scanner(System.in);
  
  System.out.print("Enter the number 1:");
  a=sc.nextInt();
  System.out.print("Enter the number 2:");
  b=sc.nextInt();
  System.out.print("Enter the number 3:");
  c=sc.nextInt();
  
  if(a>b &&a>c)
  {
   System.out.println("The number "+a+" is Biggest");
  }
  else if(b>a &&b>c)
  {
   System.out.println("The number "+b+" is Biggest");
  }
  else
  {
   System.out.println("The number "+c+" is Biggest");
  }

 }
}