class  Temp
{
 int a,b;
  
 void geṭ(int x,int y)
 {
  a=x;
  b=y;
 }
 
 void print()
 {
  System.out.println("A="+a+"\nB="+b);
 }
 
 void obk(Temp t1,Temp t2)
 {
  Temp k=new Temp();
  k.a=t1.a+t2.a;
  k.b=t1.b+t2.b;
  System.out.println("new obj a="+k.a+"\nnew obj b="+k.b);
 }
}

class obj
{
 public static void main(String args[])
 {
  Temp x=new Temp();
  x.get(2,3);  
  x.print();
  Temp y=new Temp();
  y.get(4,5);
  y.print();
  y.obk(x,y);
  
 }
}