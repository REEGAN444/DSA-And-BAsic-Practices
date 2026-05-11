import java.util.*;

class Equal
{
 public static void main(String args[])
 { 
  Scanner s=new Scanner(System.in);
  int n,temp,prid,c;
  System.out.print("Enter size of Array:");
  n=s.nextInt();
  int a[]=new int[n];
  for(int i=0;i<n;i++)
  {
   System.out.print("Enter VAlue at "+i+" :");
   a[i]=s.nextInt();
  }
  
  System.out.print("Enter pridict value:");
  prid=s.nextInt();
  c=1;
  
  for(int i=0;i<n;i++)
  {
   for(int j=0;j<n;j++)
   {
    if(a[i]==a[j])
    {
    }
    else
    {
     temp=a[i]+a[j];
     if(temp==prid)
     {
      
      System.out.println("possible:"+c);
      System.out.println("a["+i+"]="+a[i]+"\na["+j+"]="+a[j]);
      c++;
     }
    }
   }
  }
 }
}