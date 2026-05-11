public class Tester4
{
 public static void main(String args[])
 {
  short dp=7;
  int noofitems=10;
  float ppi=255.6f;
  float ta=135.50f;
  int da=(noofitems*(int)ppi)*(1-dp/100);
  double tota=da+ta;
  System.out.println(tota);
 }
}