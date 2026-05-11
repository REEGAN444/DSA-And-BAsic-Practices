import java.util.*;

class Temp
{
 int a,b,c;
  
 Temp(int x,int y)
 {
  a=x;
  b=y;
 } 

 void mul()
 {
  c=a*b;
  
  System.out.println("The Result:"+c);
 }
}



class KKf
{
 public static void main(String args[])
 {
  int x,y;
  
  Scanner s=new Scanner(System.in);
  
  System.out.print("Enter X:");
  x=s.nextInt();
  System.out.print("Enter Y:");
  y=s.nextInt(); 
  

  Temp k=new Temp(x,y);
   k.mul();
  
 }
}