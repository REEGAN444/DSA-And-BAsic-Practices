import java.io.*;
import java.util.Random;
import java.util.*;


public class Odd extends Thread
{int n;
  Odd(int x)
  {
   n=x;
  }
  
  public void run()
  {
   System.out.println("The number is "+n+"the square is"+(n*n));
  }
}


public class Even extends Thread
{
 int n;
 Even(int x)
 {
  n=x;
 }
 
 public void run()
 {
  System.out.println("The Even number is"+n+"the Cube is"+(n*n*n));
 }
}

public class Generate extends Thread
{
 int i;
 int num;
 Random r=new Random();

  
    num=r.nextInt();
   
    System.out.println("The Number Generating:"+num);
    
    if(num%2==0)
    {
      Thread t1=new Thread(new Even(num));
       t1.start();
     try
     {     
      Thread.sleep(1000);
     }
     catch(Exception e)
     {

     }
    }
    else
    {
       Thread t2=new Thread(new Odd(num));
       t2.start();
       try
       {
       Thread.sleep(1000);
       }
       catch(Exception e)
       {

       }
    
   }
 }


public class multitt extends Thread
{
 public static void main(String args[])
 {
    Generate g=new Generate();
   g.start();
 }
}