import java.util.*;

class c2
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int i,j,n,key;
  
  Scanner k=new Scanner(System.in);
  
  System.out.print("Enter nio. of elements:");
  n=k.nextInt();
  
  System.out.println("Enter array:");
  for(i=0;i<n;i++)
  {
   a[i]=k.nextInt();
  }


  System.out.print("Enter Key to search:");
  key=k.nextInt();


 Sys
 for(i=0;i<n;i++)
 {
  if(key==a[i])
  {
   System.out.println("The key value  "+a[i]+"  find in the index"+"  "+i);
   break; 
  }
 }

 }
}