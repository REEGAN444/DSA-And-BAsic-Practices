class temp
{
 int a,b;
 temp()
 {
 }
 temp(int a1,int b1)
 {
  a=a1;
  b=b1;
 }
  
 void print()
 {
  System.out.println("A="+a+"\nB="+b);
 }

 temp oprint(temp t1,temp t2)
 {
  temp k=new temp();
  k.a=t1.a+t2.a;
  k.b=t1.b+t2.b;
  return k;
 }
}

class returningobject
{
 public static void main(String args[])
 {
  temp c=new temp(2,3);
  c.print();
  temp v=new temp(6,7);
  v.print();
  temp n=v.oprint(c,v);
  n.print();
 }
}