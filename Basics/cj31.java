import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=cj31 height=500 width=500>
</applet>*/

public class cj31 extends Applet implements ItemListener
{
 Checkbox c1,c2;
 TextField t1,t2;
 public void init()
 { 
  t1=new TextField();
  t2=new TextField();
  c1=new Checkbox("reegan"); 
  c2=new Checkbox("Athi");
   
  setLayout(null);
  
  c1.setBounds(100,100,50,20);
  c2.setBounds(100,130,50,20);
  t1.setBounds(170,100,50,20);
  t2.setBounds(170,130,50,20);
  
  add(c1);
  add(c2);
  add(t1);
  add(t2);
   
  t1.setVisible(false);
  t2.setVisible(false); 
   
  c1.addItemListener(this);
  c2.addItemListener(this);
   
 }
 public void itemStateChanged(ItemEvent e)
 {
  if(c1.getState())
  {
   t1.setVisible(true);
  }
  else
  {
   t1.setVisible(false);
  }

  if(c2.getState())
  {
   t2.setVisible(true);
  }
  else
  {
   t2.setVisible(false);
  }
 }
}