class A extends Thread
{
 public void run()
 {
  System.out.println("Thread1");
  for(int i=1;i<=10;i++)
  {
   System.out.println("A:"+i);
  } 
  System.out.println("thread 1 completed");
 }
}



class B extends Thread
{
 public void run()
 {
  System.out.println("Thread 2");
  for(int i=1;i<=10;i++)
  {
   System.out.println("B:"+i);
  }
  System.out.println("Thread 2 Completed");
 }
}


class threadpriority
{
 public static void main(String args[])
 {
  A obj1=new A();
  B obj2=new B();
  
  obj1.setPriority(1);
  obj2.setPriority(10);
  
  System.out.println("starting thread1");
  obj1.start();
  System.out.println("Starting thread2");
  obj2.start();
 }
}