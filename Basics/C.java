import java.lang.*;
import java.io.*;	
class Test extends Thread
{
 public void run()
 {
   for(int i=1;i<=10;i++)
   {
    System.out.print(i);
    try
    {
    Thread.sleep(300);
    }
    catch(Exception e)
    { 
    }
   }
 }
}

class C
{
 public static void main(String args[])
 {
  Test k=new Test();
  k.start();
 }
}