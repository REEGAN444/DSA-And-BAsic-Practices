import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=ap1 width=500 height=500>
</applet>*/

public class ap1 extends Applet implements ActionListener
{
 TextField t1,t2;

 public void init()
 {
  t1=new TextField("10");
  t2=new TextField("20");
  add(t1);
  add(t2);
  t2.addActionListener(this);
 }
 
 public void paint(Graphics g)
 {String s;
  int a,b,c;
  a=Integer.parseInt(t1.getText());
  b=Integer.parseInt(t2.getText());
  c=a+b;
  s="Result="+c;
  g.drawString(s,200,300);
 } 

 public void actionPerformed(ActionEvent e)
 {
  repaint();
 }
}