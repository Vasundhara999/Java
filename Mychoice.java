import java.awt.*;
import java.awt.event.*;
class Mychoice extends Frame implements ItemListener
{
	String msg;
	Choice ch;
	Mychoice()
	{
	this.setLayout(null);
	ch=new Choice();
	ch.setBounds(100,100,150,100);
	ch.add("java");
	ch.add("c++");
	ch.add("python");
	ch.add("php");
	add(ch);
	ch.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
	repaint();
	}
	public void paint(Graphics g)
	{
	g.drawString("selected language:",10,350);
	msg=ch.getSelectedItem();
	g.drawString(msg,10,370);
	}
public static void main(String arg[])
{
	Mychoice mc=new Mychoice();
	mc.setSize(1000,1000);
	mc.setTitle("choose one");
	mc.setVisible(true);
}
}