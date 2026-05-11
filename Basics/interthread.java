import java.lang.*;

class myclass
{
 int val;
 Boolean flag=false;
  
 synchronized int get()
 {
  if(!flag)
  {
   try
   {
    wait();
   }
   catch(Exception e)
   {
   System.out.println("Thread interrupted");
   }
  System.out.println("consumer consuming:"+val);
  flag=false;
  notify();
  return val;
 }
 synchronized int put(int val)
 {
  if(flag)
  {
   try
   {
    wait();
   }
   catch(InterruptedException e)
   {
    System.out.println("Thread interrupted");
   }
  this.val=val;
  flag=true;
  System.out.println("Producer producing:"+val);
  notify();
  return;
  }
 }
}

class producer extends Thread
{
 myclass th1;
  
 producer(myclass t)
 {
  th1=t;
 }
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   th1.put(i);
  }
 }
}
class consumer extends thread
{
 myclass th2;
 consumer(myclass t)
 {
  th2=t;
 } 
 public void run()
 {
  for(int i=1;i<=5;i++)
  {
   th2.get();
  }
 }
}
class interthread
{
 public static void main(String args[])
 {
  myclass obj=new myclass();
  producer p=new producer(obj);
  consumer c=new consumer(obj);
  p.start();
  c.start();
 }
}