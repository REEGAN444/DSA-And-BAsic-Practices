class A1
{
 public int count;

 public A1()
 {
  count=10;
 }

 public int method1()
 {
  int count=20;
  
  return this.count;
 }
}


class B1 extends A1
{
 public int method1()
 {
  return this.count=15;
 }
 
 public int method2()
 {
  return 20;
 }
}

class C1 extends B1
{
 public int method2()
 {
  return 40;
 }
}

public class Test1
{
 public static void main(String args[])
 {
  A1 a=new A1();
  B1 b=new B1();
  C1 c=new C1();
 
  System.out.println(a.method1()+b.method1()+c.method2());
 }
}


