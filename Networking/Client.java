package Networking;
import javax.swing.*;
import java.net.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class Client {
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		Socket soc;
		BufferedImage img=null;
		soc=new Socket("localhost",4000);
		System.out.println("Client is running");
		try {
			System.out.println("Reading img from Disk");
			img=ImageIO.read(new File("YOU.jpg"));
			
		}
		catch(Exception e)
		{
			
		}
		
		
	}

}
