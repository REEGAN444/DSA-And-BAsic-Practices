package Networking;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class SocketExample {
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		Socket socket =new Socket("localhost",9999);

		DataInputStream dis=new DataInputStream(socket.getInputStream());
		String msg=dis.readUTF();
		System.out.println("Server Says:"+msg);
		
	}

}
