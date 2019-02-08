import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener
{
	Button b1,b2,b3;
	Frame1()
	{
	setLayout(new FlowLayout());
	b1=new Button("next");
	b2=new Button("skip");
	b3=new Button("close");
	add(b1);
	add(b2);
	add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
    if(ae.getSource()==b1)
    {
    Frame2 f2=new Frame2();
    f2.setSize(800,800);
    f2.setVisible(true);
    }
    else if(ae.getSource()==b2)
    {
    	Frame3 f3=new Frame3();
    	f3.setSize(800,800);
    	f3.setVisible(true);
    }
else
{
	System.exit(0);
}
}
public static void main(String arg[])
{
	Frame1 f1=new Frame1();
	f1.setSize(800,800);
	f1.setTitle("first frame");
	f1.setVisible(true);
}
}