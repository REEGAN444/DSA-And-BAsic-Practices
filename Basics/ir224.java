import java.util.*;

class Rec
{
 int n;
 int fact(int x)
 {
  n=x;
  if(n==1)
    return(1);
  else
    return(n*fact(n-1));
 }
}


class ir224
{
 public static void main(String args[])
 {
  int n,res;
  Scanner s=new Scanner(System.in);
  Rec r=new Rec();
  System.out.print("Enter N=");
  n=s.nextInt();
  res=r.fact(n);
  System.out.println("The Factorial:"+res);
 }
}