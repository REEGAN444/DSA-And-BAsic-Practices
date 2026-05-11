import java.io.*;

class multicat
{
 public static void main(String args[])
 {
  int a[]=new int[3];
  
  try
  {
   for(int i=0;i<3;i++)
   {
    a[i]=i*i;
   }
  
  for(int i=0;i<3;i++)
  {
   a[i]=i/i;
  }
  }
  catch(ArithmeticException e)
  {
   System.out.println("The Zero divide");
  }
  catch(Exception e)
  { 
   System.out.println("overflow");
  }
 }
}