class A extends Thread
{
 public void run()
 {
  System.out.println("T1 start");
  for(int i=0;i<10;i++)
  {
   System.out.println("T1:"+i);
  }
  System.out.println("T1 ending");
 }
}

class B extends Thread
{
 public void run()
 {
  System.out.println("T2 start");
  for(int i=0;i<10;i++)
  {
   System.out.println("T2:"+i);
  }
  System.out.println("T2 ending");
 }
}

class M
{
 public static void main(String args[])
 {
  A a=new A();
  B b=new B();
  a.setPriority(1);
  b.setPriority(10);
  a.start();
  b.start();
 }
}