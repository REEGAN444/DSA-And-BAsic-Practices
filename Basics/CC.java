import java.io.*;

class A implements Runnable
{
 synchronized public void run()
 {
  System.out.println("Thread1 starting");

  for(int i=0;i<=20;i++)
  {
   try
   {
    if(i<10)
        Thread.sleep(700);
   }
   catch(Exception e)
   {
   }
   System.out.println("thread1:"+i);
  }
  System.out.println("Thread1 ending");
 }
}

/*class B extends Thread
{
 synchronized public void run()
 {
  System.out.println("Thread2 start");
  for(int i=0;i<10;i++)
  {
   System.out.println("Thread2:"+i);
  }
  System.out.println("Thread2 ending");
 }
}*/

class CC
{
 public static void main(String args[])
 {
  Thread a=new Thread(new A());
 // B b=new B();
  a.start();
  //b.start();
 }
}