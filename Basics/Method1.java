
interface Tan
{
 public void met1();
 final static int a=10;
}
class Method1 implements Tan
{
	public void met1()
 	{
 	 System.out.println("Reegan");
 	}
	public static void main(String[] args)
	{
   	 	Tan t=new Tan();
		System.out.println(t.a);
	}
	
}
