class Inherit
{
 int x,y;
 Inherit(int x1,int y1)
 {
   x=x1;
   y=y1;
 }
 
 void print()
 {
  System.out.println("X="+x+"Y="+y);
 }
}


class inherit2 extends Inherit
{
 int z;
 inherit2(int x1,int y1,int z1)
 {
  super(x1,y1);
  z=z1;
 }

void print1()
 {
  print();
  System.out.println("Z="+z);
 }
 
 void sum()
 {
  System.out.println("X+Y+Z="+(x+y+z));
 }
}
 


class jjj
{
 public static void main(String args[])
 {
   inherit2 k=new inherit2(2,3,4);
   k.print1();
   k.sum();
 }
}