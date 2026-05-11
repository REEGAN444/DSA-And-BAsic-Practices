import java.util.*;

class sit
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  
  System.out.print("Enter the how many seat:");
  int seat=s.nextInt();
  
  System.out.print("ENter the Seat:");
  int n=s.nextInt();


  if(n%seat==1 || n%seat==0)
  {
    System.out.print("Your seat is in Window Seat");
  }
  else
  {
   System.out.print("Your seat is not a window seat");
  }
 }
}
 