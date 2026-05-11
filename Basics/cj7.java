import java.util.*;

class cj7
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  int n;
  
  System.out.print("Enter the number:");
  n=s.nextInt();
  
  n=n*(n+1)/2;
  System.out.println("N="+n);
}
}