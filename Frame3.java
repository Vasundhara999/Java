import java.awt.*;
import java.awt.event.*;
class Frame3 extends Frame implements ActionListener
{
	Button bb;
	Frame3()
	{
	setLayout(new FlowLayout());
	bb=new Button("previous");
	add(bb);
	bb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	
	if(ae.getSource()==bb)
	{
		Frame2 f2=new Frame2();
		f2.setSize(800,800);
    f2.setVisible(true);
	}
	}
}

