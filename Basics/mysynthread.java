class Test
{
 synchronized void display(int num)
 {
  System.out.println("\nTable for:"+num);
  for(int i=1;i<=10;i++)
  {
   System.out.print(num*i+"  ");
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

class A extends Thread
{
 Test th1;
  
 A(Test t)
 {
  th1=t;
 }
  
 public void run()
 {
  th1.display(2);
 }
}

class B extends Thread
{
 Test th2;
 B(Test t)
 {
  th2=t;
 }
  
 public void run()
 {
  th2.display(100);
 }
}

class mysynthread
{
 public static void main(String args[])
 {
  Test obj=new Test();
   A t1=new A(obj);
   B t2=new B(obj);
   t1.setPriority(1);
   t2.setPriority(10);
   t1.start();
   t2.start();
 }
}