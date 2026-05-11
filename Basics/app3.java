import java.applet.*;
import java.awt.event.*;
import java.awt.*;

/*<applet code=app3 height=500 width=500>
</applet>*/

public class app3 extends Applet implements ItemListener
{
 Choice c1;
 String s1,s2;
 
 public void init()
 {
  c1=new Choice();
  c1.addItem("");
  c1.addItem("Reegan");
  c1.addItem("Shainee");
  c1.addItem("Stella");
  c1.addItem("Antony");
  s1=s2="";
  
  setLayout(null);
   
  c1.setBounds(100,100,100,20);
  add(c1);
  
  c1.addItemListener(this);
 }
  public void paint(Graphics t)
  {
   t.drawString(s1,200,100);
   t.drawString(s2,310,100);
  }

  public void itemStateChanged(ItemEvent e)
  { 
   s1="Name="+c1.getSelectedItem();
   s2="InDex="+c1.getSelectedIndex();
   repaint();
  }
 
}
