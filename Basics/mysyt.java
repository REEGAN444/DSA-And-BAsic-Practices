import java.io.*;

class Test
{
 public void display(int num)
 {
  synchronized(this)
  {
   System.out.println("table:"+num);
   for(int i=1;i<=10;i++)
   {
   System.out.println(num*i);
   }
   try
   {
    Thread.sleep(1000);
   }
   catch(Exception e)
   {
   }
  }
 }
}

class A extends Thread
{
 Test t1;
 
 A(Test t)
 {
  t1=t;
 } 
  
 public void run()
 {
  t1.display(2);
 }
}


class B extends Thread
{
 Test t2;
  
  B(Test tt)
  {
   t2=tt;
  }
 
 public void run()
 {
  t2.display(1000);
 }
}

class mysyt
{
 public static void main(String args[])
 {
  Test T1=new Test();
   A t1=new A(T1);
   B t2=new B(T1);

  
   t1.start();
   t2.start();
 }
}