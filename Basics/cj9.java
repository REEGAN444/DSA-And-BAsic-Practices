import java.util.*;

class cj9
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n;
  System.out.print("Enter the number:");
  n=s.nextInt();
   
  for(int i=1;i<=10;i++)
  {
   System.out.println(i+" * "+n+" = "+(i*n));
  }
 }
}