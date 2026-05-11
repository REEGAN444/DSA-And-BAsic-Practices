import java.lang.Exception;

class MOE extends Exception
{
 MOE(String msg)
 {
  super(msg);
 }
}


class UserException1
{
 public static void main(String args[])
 {
  int age=15;
  try
  {
   throw new MOE("Your age is less");
  }
  catch(MOE e)
  {
   System.out.println("this is your Exception");
   System.out.println(e);

  }
 }
}