import javax.swing.*;
import java.awt.*;
class Framecolor extends JFrame
{
	public static void main(String arg[])
	{
	Framecolor obj=new Framecolor();
	Container c=obj.getContentPane();
	c.setBackground(Color.green);
	obj.setTitle("my swing");
    obj.setSize(400,400);
    obj.setVisible(true);
    obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
