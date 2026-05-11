import java.util.*;

class K
{
 public static void main(String args[])
 {
  int a[][]=new int[3][3];
  int b[][]=new int[3][3];
  int c[][]=new int[3][3];
  int i,j,k;

  Scanner s=new Scanner(System.in);

  System.out.print("Enter 1st Array:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++) 
   {
    a[i][j]=s.nextInt();
   }
  }

  System.out.print("Enter 2nd array:");
  
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
   {
    b[i][j]=s.nextInt();
   }
  }

  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
    {c[i][j]=0;
      for(k=0;k<3;k++)
      {
 	c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
      }
    }
  }

  System.out.println("The matrix:");
  for(i=0;i<3;i++)
  {
   for(j=0;j<3;j++)
    {
     System.out.print("\t"+c[i][j]);
    }
   System.out.println();
  }
  
 }
}
