import java.util.*;

class th
{
 static void  sub(int a)
 {
  System.out.println("HEllo"+a);
 }  
}

class the
{
 public static void main(String args[])
 {
  int a;
  
  Scanner s=new Scanner(System.in);
  System.out.print("Enter the number:");
  a=s.nextInt();
   
  th.sub(a);
 }
}