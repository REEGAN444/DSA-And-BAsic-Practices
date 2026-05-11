import java.io.*;

class Dup
{
 public static void main(String args[])
 {
    int a[]=new int[10],n,i,j;
   try
   {
    DataInputStream k=new DataInputStream(System.in);
    System.out.print("Enter no. of elements:");
    n=Integer.parseInt(k.readLine());
    
    System.out.println("Enter Elements:");
    for(i=0;i<n;i++)
    {
      a[i]=Integer.parseInt(k.readLine());
    }

    System.out.println("The Elements are:");
    for(i=0;i<n;i++)
    {
     System.out.print("  "+a[i]);
    }
 
    for(i=0;i<n-1;i++)
    {
     for(j=i+1;j<n;j++)
     {
      if(a[i]==a[j])
       {
        System.out.println("\nThe element repeated is:"+a[i]+"\nWith the index arr["+i+"] and index arr["+j+"]");
        throw new IOException();
 
       } 
     }
    }
   }
   catch(IOException e)
   {
    System.out.println("There is an Duplicate");
   }
 }
}