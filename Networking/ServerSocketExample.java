package Networking;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
	public static void main(String args[]) throws IOException
	{
		ServerSocket ssocket=new ServerSocket(9999);
		Socket socket=ssocket.accept();
		DataOutputStream dos=new DataOutputStream(socket.getOutputStream());
		
		dos.writeUTF("hhhhhhhhh");
		
		dos.flush();
		dos.close();
	}
}
