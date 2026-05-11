import java.util.*;
class Ch
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int choice,a,b,res;
  System.out.print("Enter A:");
  a=sc.nextInt();
  System.out.print("Enter B:");
  b=sc.nextInt();
  System.out.print("1.add\n2.sub\n3.mul\n4.div\n:");
  choice=sc.nextInt();
  
   switch(choice)
   {
     case 1:
 	res=a+b;
	System.out.println("The Answer:"+res);
	break;
     case 2:
	res=a-b;
 	System.out.println("The Answer:"+res);
 	break;
     case 3:
	res=a*b;
        System.out.println("The Answer:"+res);
	break;
     case 4:
 	res=a/b;
  	System.out.println("The Answer:"+res);
  	break; 
   }
     
 }
}