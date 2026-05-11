import java.util.*;
 
class t11
{
 int a;
 t11(int a1)
 {
  a=a1;
 } 
 void put()
 { 
  System.out.println("class 1 a:"+a);
 }
}

class t22 extends t11
{
 int b;
 t22(int b1)
 {
  b=b1;
 }
 void put1()
 {
  System.out.println("class 2 b:"+b);
 }
}

class Testt
{
 public static void main(String args[])
 {
  t22 k=new t11();
  k.put(); 
 }
}