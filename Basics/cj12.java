import java.util.*;

class cj12
{
 public static void main(String args[])
 {
  int  year;
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the Year:");
  year=s.nextInt();
  if(year%4==0)
  {
   System.out.println("The Given Year is the leap Year:"+year);
  }
  else
  {
   System.out.println("The Given is not the leap year");
  }
 }
}