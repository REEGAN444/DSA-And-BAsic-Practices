import java.util.*;

class cj32
{
  static char find(char a,char b) 
  {
   char c,d;
   c=a;
   d=b;
   
    if(c>d)
    {
     return c;
    } 
    else
    { 
     return d;
    }
  }


  public static void main(String args[])
  {
   char a,b;
   
   Scanner s=new Scanner(System.in);
   
   System.out.print("Enter the Char1:");
   a=s.next().charAt(0);
   System.out.print("Enter the Char2:");
   b=s.next().charAt(0);
   
   System.out.println("The biggest is:"+ find(a,b));
  }
 
}