import java.util.*;

class cj3
{
 public static void main(String args[])
 {
  int age;
  Boolean b=false;
  
   Scanner s=new Scanner(System.in);
   
   System.out.print("Enter the Age:");
   age=s.nextInt();
   
   if(age>=18)
   {
    b=true;	
   }
   
  
   if(b==true)
   {
    System.out.println("Your Are allowed");
   }
   else
   {
   System.out.println("Your are Not Allowed");
   }
 }
}