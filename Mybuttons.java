import java.awt.*;
import java.awt.event.*;
class Mybuttons extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Mybuttons()
	{
	this.setLayout(new FlowLayout());
	b1=new Button("yellow");
	b2=new Button("blue");
	b3=new Button("pink");
	
	this.add(b1);
	this.add(b2);
	this.add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
    b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	String str=ae.getActionCommand();
	if(str.equals("yellow"))this.setBackground(Color.yellow);
    if(str.equals("blue"))this.setBackground(Color.blue);
	if(str.equals("pink"))this.setBackground(Color.pink);
}

public static void main(String arg[])
{
Mybuttons mb=new Mybuttons();
mb.setSize(500,500);
mb.setTitle("Mybuttons");
mb.setVisible(true);

}
}