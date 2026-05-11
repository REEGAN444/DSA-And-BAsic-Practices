import java.util.*;

class Roman
{
public static void main(String args[])
{
 
 Scanner s=new Scanner(System.in);
 System.out.print("Enter the Roman:");
 String set=s.next();
 char arr[]=set.toCharArray();
 int temp=0;
 
 
 
 int I=1,II=2,III=3,IV=4,V=5,VI=6,VII=7,VIII=8,IX=9,X=10,L=50,C=100,D=500,M=1000;

 if(arr[0]>arr[1])
 {
  for(int i=0;i<set.length();i++)
  {
   temp=temp+int(arr[i]);
  }
 }


  
 
 
}
}