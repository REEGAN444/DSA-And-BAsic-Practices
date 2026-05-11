import java.util.*;

class cj6
{
 public static void main(String args[])
 {
  int n;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the Number:");
  n=s.nextInt();
  
  for(int i=1;i<=n;i++)
  {
   if(i%4==0)
   {
    continue;
   }
   System.out.println(i);
  }
 }
}