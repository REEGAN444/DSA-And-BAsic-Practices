class outer
{
 static int data=30;
  
 static class inner
 {
  void msg()
  {
   System.out.println("Data="+data);
  }
 }


 public static void main(String args[])
 {
  inner k=new inner();
  k.msg();
 
 }
}