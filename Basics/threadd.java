import java.io.*;

class Usingint implements Runnable
{
 public void run()
 {
  System.out.println("Thread reeegan");
 }
}

class threadd
{
 public static void main(String args[])
 {
  Thread s=new Thread(new Usingint());
  
  s.start();
 }
}