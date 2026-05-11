package Networking;
import java.net.*;
public class DatagramSocketExample {
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds=new DatagramSocket(9999);
		
		byte buf[]=new byte[1024];//size choice
		
		DatagramPacket dp=new DatagramPacket(buf,1024);
		ds.receive(dp);
		
		String msg=new String(dp.getData());
		System.out.println(msg);
		
		ds.close();
	}

}
