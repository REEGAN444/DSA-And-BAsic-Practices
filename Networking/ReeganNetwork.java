package Networking;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


//me as a Server
public class ReeganNetwork extends Frame implements Runnable,ActionListener,MouseListener{

	TextField tf;
	TextArea ta;
	Button bt,exit;
	
	
	ServerSocket ss;
	Socket s;
	DataInputStream dis;
	DataOutputStream dos;
	
	Thread chat;
	
	ReeganNetwork()
	{
		tf=new TextField();
		ta=new TextArea();
		bt=new Button("Send");
		exit=new Button("Exit");
		
		exit.addMouseListener(this);
		bt.addActionListener(this);
		
		try
		{
			ss=new ServerSocket(12000);
			s=ss.accept();
			dis=new DataInputStream(s.getInputStream());
			dos=new DataOutputStream(s.getOutputStream());
			
			
		}
		catch(Exception e)
		{
			
		}
		
		tf.setBounds(100,100,100,20);
		ta.setBounds(100,130,250,300);
		bt.setBounds(210,100,50,20);
		exit.setBounds(270,100,50,20);
		add(tf);
		add(ta);
		add(bt);
		add(exit);
	chat =new Thread(this);
	chat.setDaemon(true);
	chat.start();
	
	setSize(500,500);
	setTitle("Reegan");
	setLayout(null);
	setVisible(true);
		
	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
		String msg=tf.getText();
		ta.append("Reegan:"+msg+"\n");
		tf.setText("");
		
		
		try {
			
			dos.writeUTF(msg);
			dos.flush();
			
		} catch (IOException e1) {
			
			
		}
		
	}
	
	
	
	public static void main(String args[])
	{
		new ReeganNetwork();
	}
	
	public void run()
	{
		while(true)
		{
			try {
				String msg=dis.readUTF();
				ta.append("Athi:"+msg+"\n");
			}
			catch(Exception e)
			{
				
			}
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
	
		
		Frame fs=new Frame("Alert");
		fs.setSize(200,100);
		Label l=new Label("Your Info's are Temporary");
		fs.setLayout(new FlowLayout());
		fs.add(l);
		fs.setVisible(true);
		
		try {
			Thread.sleep(2000);
			System.exit(0);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
