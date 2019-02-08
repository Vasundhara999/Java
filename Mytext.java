import java.awt.*;
import java.awt.event.*;
class Mytext extends Frame implements ActionListener
{
TextField name,pass;
Mytext()
{
	setLayout(new FlowLayout());
	Label n=new Label("Name: ",Label.LEFT);
	Label p=new Label("Password: ",Label.LEFT);
name=new TextField(20);
pass=new TextField(20);
pass.setEchoChar('*');
add(n); 
add(name);
add(p);
add(pass);
name.addActionListener(this);
pass.addActionListener(this);

}
public void actionPerformed(ActionEvent ae)
{
	repaint();

}
public void paint(Graphics g)
{
	g.drawString("Name: "+name.getText(),10,200);
	g.drawString("Password: "+pass.getText(),10,240);
	}
	public static void main(String args[])
	{
	Mytext mb=new Mytext();
	mb.setSize(1000,1000);
	mb.setTitle("text");
	mb.setVisible(true);

	}

}