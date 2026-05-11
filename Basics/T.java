import  java.util.*;

class A
{
 int x,y,z;
 A(int x1,int y1)
 {
  x=x1;
  y=y1;
 }


 void print() 
 {
  z=x+y;
  System.out.println("A="+x+"\nB="+y);
  System.out.println("Sum="+z);
 }
}



class T
{
 public static void main(String args[])
 {
  int a,b;
  
  Scanner s=new Scanner(System.in);
  
  System.out.print("Enter a:");
  a=s.nextInt();
  System.out.print("Enter b:");
  b=s.nextInt();
  
  A g=new A(a,b);
  g.print();
 }
}


