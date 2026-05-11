import java.io.*;

class Tone extends Thread
{

 public void run()
 {
  for(int i=0;i<=3;i++)
  {
   System.out.println("Tone count:"+i);
  }

  System.out.println("Tone completed");
 }
}


class Ttwo extends Thread
{
 public void run()
 {
  for(int i=0;i<=3;i++)
  {
   System.out.println("Count:"+i);
  }
  System.out.println("Ttwo completed");
 }
}


class Tthree extends Thread
{
 public void run()
 {
   try
   {
      for(int i=0;i<5;i++)
      {
       if(i==3)
       {
        sleep(500);
   	System.out.println("Tthree count:"+i);
       }
      System.out.println("Count Three complited");
      }
 
   }
   catch(InterruptedException e)
   {
    System.out.println(e);
   }
 }
}



class k1
{
 public static void main(String args[])
 {
   Tone t1=new Tone();
   Ttwo t2=new Ttwo();
   Tthree t3=new Tthree();
   
   t1.setPriority(Thread.MIN_PRIORITY);
   t2.setPriority(Thread.MAX_PRIORITY);
   t3.setPriority(Thread.NORM_PRIORITY);


  t2.start();
  t3.start();
  t1.start(); 
 }
}