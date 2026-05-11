import java.util.*;
import java.io.*;


class NestedTry
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  try
  {
  int a=Integer.parseInt(args[0]);
  int b=Integer.parseInt(args[1]);
  float ans=0;
  try
  {
  ans=a/b;
  System.out.println("ANS="+ans);
  }
  catch(ArithmeticException e)
  {
   System.out.println("Divide by zero");
  }
  }
  catch(NumberFormatException e)
  {
   System.out.println("invalid input");
  }
 }
}