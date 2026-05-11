import java.applet.*;


/*<applet code=reegan width=500 height=500>
</applet>*/


public class reegan
{
  Label l1,l2;
  
 public void init()
 {
  l1=new Label("Reegan");
  l2=new Label("Dinesh");
  
  setLayout(null);
  
  setBounds(100,100,50,50);
  setBounds(100,160,50,50);
  add(l1);
  add(l2);
 }
}