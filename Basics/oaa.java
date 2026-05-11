class oaa
{ 
 int a,b;
 oaa()
 {
 }
 oaa(int x,int y)
 {
  a=x;
  b=y;
 }
 
 void print()
 {
  System.out.println("A="+a+"\nB="+b);
 }
 
 void oprint(oaa r1,oaa r2)
 {
  oaa k=new oaa();
  k.a=r1.a+r2.a;
  k.b=r1.b+r2.b;
  k.print();
 }
}

class UUU
{
 public static void main(String args[])
 {
  oaa k1=new oaa(2,3);
  oaa k2=new oaa(6,7);
  k1.print();
  k2.print();
  
  k2.oprint(k1,k2);
 }
}