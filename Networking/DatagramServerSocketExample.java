package Networking;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class DatagramServerSocketExample {
	public static void main(String args[]) throws Exception
	{
		DatagramSocket ds=new DatagramSocket();
		String msg="Hi Client oiemrgovim pornveproingv erine irng irnforenv prinpoeing peringpringeir pringpeoringeori origpoeringeoirngpoeringpoeirngpoiernopirngionerpoiner efomef[ormf[roem v[ekrmr vok mvpokemv oeinv gibnokgtnitbjtibtoeinbronotnubvoteinbiugtbnotinb";
		
		InetAddress ip=InetAddress.getByName("localhost");
		
		DatagramPacket dp=new DatagramPacket(msg.getBytes(),msg.length(),ip,9999);
		
		ds.send(dp);
		ds.close();
		
	}

}
