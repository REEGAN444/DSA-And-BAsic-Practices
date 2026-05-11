import java.util.*;
class cj14  //date checker
{
  public static void main(String args[])
  {
   int d,m,y;
   Scanner s=new Scanner(System.in);
   System.out.print("Enter the DAY:");
   d=s.nextInt();
   System.out.print("Enter the month:");
   m=s.nextInt();
   System.out.print("Enter the year:");
   y=s.nextInt();
   if(d<32 && d>0 && m<13 && m>0 && y>1000)
   {
    System.out.println("The Given is Valid:  "+d+":"+m+":"+y);
   }
   else
   {
    System.out.println("The given date is not valid :  "+d+":"+m+":"+y);
   }
    
  }
}