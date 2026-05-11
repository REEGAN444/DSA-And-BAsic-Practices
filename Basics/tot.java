import java.util.*;
class T
{
  int d,f;
  String src,aux,tar;
   
  void toh(int d1,String src1,String aux1,String tar1)
  {
   d=d1;
   src=src1;
   aux=aux1;
   tar=tar1;
   if(d==1)
   {
    System.out.println("Move disk  "+d1+"  from  "+src1+"  to  "+tar1);
    return;
   }
   f=d-1;
   toh(f,"A","C","B");
   System.out.println("Move disk  "+d1+"  from  "+src1+"  to  "+tar1);
   toh(f,"B","A","C");

  }
}



class tot
{
 public static void main(String args[])
 {
   int d,f;
   Scanner k=new Scanner(System.in);
   System.out.print("Enter the no. of disk:");
   d=k.nextInt();
   T g=new T();
   g.toh(d,"A","B","C");
   

 }
}