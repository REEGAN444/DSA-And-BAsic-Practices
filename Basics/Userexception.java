import java.io.*;
import java.util.*;

class Myexception extends Exception
{
 private int d;
 Myexception(int a) 
 {
  d=a;
 }
 
 public String tostring()
 { 
  return "MyException["+ d+"]";
 }
}




class UserException
{
 static void compute(int a)throws Myexception
 {
  System.out.println("Called compute("+a+")");
  if(a>10)
  {
   throw new Myexception(a);
  }
 System.out.println("Normal exit");
 }
 public static void main(String args[])
 {
  try
  {
   compute('d');
   compute(2);
  }
  catch(Myexception e)
  {
   System.out.println("Caught:"+e);
  }
 }
}