import java.util.*;

class cj10
{
 public static void main(String args[]) 
 {
  int n,fact=1;
  
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the Number:");
  n=s.nextInt();
  for(int i=n;i>0;i--)
  {
   fact=fact*i;
  }
  System.out.println("The Factoral of the number:"+fact);
 }
}