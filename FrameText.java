import javax.swing.*;
import java.awt.*;
class FrameText extends JFrame
{
	
	
     public void paint(Graphics g)
     {
     	g.setColor(Color.red);
     g.drawString("hello world",100,250);
     }
	
public static void main(String arg[])
{
	FrameText obj=new FrameText();
	
	obj.setTitle("my swing");
	obj.setSize(400,400);
	obj.setVisible(true);
	obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
