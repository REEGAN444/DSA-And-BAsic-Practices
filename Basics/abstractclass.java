import java.util.*;

abstract class it
{
  abstract void printg();
  static final int k=9;
}


class shape extends it
{
 void printg()
 {
  System.out.println("Dinesh");
  System.out.println(k);
 }
}
 
class IT extends shape
{
 public static void main(String args[])
 {
  
  shape d=new shape();
   
  d.printg();
 
  
 }
}	