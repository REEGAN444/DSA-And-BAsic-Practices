import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=app7 height=500 width=500>
</applet>*/

public class app7 extends Applet
{
 public void paint(Graphics g)
 {
  g.setColor(Color.red);
  g.drawLine(250,0,500,500);
  g.setColor(Color.blue);
  g.drawLine(500,500,0,500);
  g.setColor(Color.green);
  g.drawLine(0,500,250,0);
 }
}