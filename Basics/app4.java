import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=app4  height=1000 width=1000>
</applet>*/

public class app4 extends Applet implements ItemListener
{
 Label eno1,ena1,gen1,ms1,des1,ex1;
 TextField tno,tna;
 CheckboxGroup g,m;
 Checkbox g1,g2,m1,m2,e1;
 Choice d;
 Button b1;
 public void init()
 {
  eno1=new Label("EMP NO:");
  ena1=new Label("EMP NAME:");
  tno=new TextField();
  tna=new TextField();
  gen1=new Label("GENDER:");
  g=new CheckboxGroup();
  m=new CheckboxGroup();
  g1=new Checkbox("MALE",g,false);
  g2=new Checkbox("FEMALE",g,false);
  ms1=new Label("MARTIAL STATE:");
  m1=new Checkbox("SINGLE",m,false);
  m2=new Checkbox("UNMARRIED",m,false);
  des1=new Label("DESING:");
  d=new Choice();
  d.addItem("clerk");
  d.addItem("manager");
  d.addItem("devop");
  d.addItem("designer");
  ex1=new Label("EXPERIENCE");
  e1=new Checkbox("YES");
  b1=new Button("SUBMIT");
  setLayout(null);


  eno1.setBounds(100,100,100,20);
  ena1.setBounds(100,130,100,20);
  gen1.setBounds(100,160,100,20);
  ms1.setBounds(100,220,100,20);
  des1.setBounds(100,250,100,20);
  ex1.setBounds(100,280,100,20);
  tno.setBounds(210,100,100,20);
  tna.setBounds(210,130,100,20);
  g1.setBounds(210,160,100,20);
  g2.setBounds(210,190,100,20);
  m1.setBounds(210,220,100,20);
  m2.setBounds(320,220,100,20);
  d.setBounds(210,250,100,20);
  e1.setBounds(210,280,100,20);
  b1.setBounds(160,330,60,20);
  
  
  add(eno1);
  add(ena1);
  add(tno);
  add(tna);
  add(gen1);
  add(g1);
  add(g2);
  add(ms1);
  add(m1);
  add(m2); 
  add(des1);
  add(d);
  add(ex1);
  add(e1);
  add(b1);
  }
  
  public void itemStateChanged(ItemEvent e)
  {
  }
  
}