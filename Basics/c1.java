import java.util.*;

class c1
{
 public static void main(String args[])
 {
  int a[]=new int[10];
  int i,j,temp,n;
  
  Scanner k=new Scanner(System.in);
  
  System.out.print("Enter Array size:");
  n=k.nextInt();
  
  System.out.print("Enter array:");
  for(i=0;i<n;i++)
  {
   a[i]=k.nextInt();
  }


  for(i=0;i<n-1;i++)
  {
   for(j=i+1;j<n;j++)
   {
    if(a[i]>a[j])
    {
    temp=a[i];
    a[i]=a[j]; 
    a[j]=temp;
    }
   }
  }


  System.out.println("Selection Sort");
  for(i=0;i<n;i++)
  {
   System.out.print(a[i]+"  ");
  }
 }
}