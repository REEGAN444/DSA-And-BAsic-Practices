import java.util.*;

class Student
{

 public static void main(String args[])
 {
  int tam,eng,roll,mat,tot;
  double g;
  String name;
  int a[]=new int[5];
  int fin;
  
  Scanner s =new Scanner(System.in);
  System.out.print("Enter the name:");
  name=s.next();
  System.out.print("Enter your roll:");
  roll=s.nextInt();
  System.out.print("Enter the tamil mark:");
  tam=s.nextInt();
  a[0]=tam;
  System.out.print("Enter the English mark:");
  eng=s.nextInt();
  a[1]=eng;
  System.out.print("Enter the maths mark:");
  mat=s.nextInt();
  a[2]=mat;
  
  tot=tam+eng+mat;
  g=tot/3;
  
  System.out.println("The Total mark:"+tot);
  System.out.println("The Average:"+g);
  

  for(int i=1;i<=3;i++)
  {
   fin=a[i];
   
  if(fin>=90 && fin<100)
  {
   System.out.println("S Grade");
  }
  else if(fin>=80&&fin<90) 
  {
   System.out.println("A+ grade");
  }
  else if(fin>=70 && fin<80)
  {
   System.out.println(" A grade");
  }
  else if(fin>=60 && fin<70) 
  {
  System.out.println("B+ grade");
  }
  else if(fin>=50&& fin<60) 
  {
   System.out.println("B Grade");
  }
  else if(fin<50)
  {
   System.out.println("Reappear");
  }
}
 }
}