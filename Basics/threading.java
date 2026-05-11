import java.io.*;

class A extends Thread
{
 public void run()
 {
  System.out.println("Single thread Created");
 }
}

class threading
{
 public static void main(String args[])
 {
  A s=new A();
  s.start();
 }
}