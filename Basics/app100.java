import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code=app100 height=500 width=500>
</applet>*/

public class app100 extends Applet implements MouseListener,MouseMotionListener
{
 String s;
 public void init()
 {
  addMouseListener(this);
  addMouseMotionListener(this);
  s="";
 }

 public void paint(Graphics g)
 {
  g.drawString(s,100,100);
 }

 public void mouseMoved(MouseEvent e)
 {
  int x,y;
  
   x=e.getX();
   y=e.getY();
   s=" X: "+x+" Y: "+y;
  repaint();
 }

 public void mouseClicked(MouseEvent e)
 {
  s="MouseClicked";
  repaint();
 }
 
 public void mouseReleased(MouseEvent e)
 {
  s="MouseReleased";
  repaint();
 }
 public void mouseDragged(MouseEvent e)
 {
  s="MouseDragged";
  repaint();
 }
 public void mouseEntered(MouseEvent e)
 {
  s="MouseEntered";
  repaint();
 }
 public void mouseExited(MouseEvent e)
 {
  s="Mouse Exited";
  repaint();
 }
 
 public void mousePressed(MouseEvent e)
 {
  s="MousePressed";
  repaint();
 } 
}