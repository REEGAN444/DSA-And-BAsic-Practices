import java.io.*;

class except
{
 public static void main(String args[])
 {
  void neww() throws new IOException
  {
   try
   {
    for(int i=0;i<10;i++)
    {
     System.out.println("I="+i);
     if(i==3)
     {
      throw new IOException();
     }
    }
   }
   catch(Exception e)
   {
   }
   
   neww()
  }
 }
}