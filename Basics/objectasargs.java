class  Temp
{
 int a,b;
  
 Temp(int x,int y)
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
  Temp p=new Temp(2,3);
    
  p.print();
  Temp q=new Temp(5,6);
  q.print();
  q.obk(p,q);
  
 }
}