import java.awt.*;
import java.awt.event.*;
class Myscroll extends Frame implements AdjustmentListener
{
	Scrollbar s1;
	String msg="";
	Myscroll()
	{

	setLayout(null);
	s1=new Scrollbar(Scrollbar.VERTICAL,0,30,0,400);
	s1.setBounds(200,50,40,200);
	add(s1);
	s1.addAdjustmentListener(this);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
    repaint();
    }
    public void paint(Graphics g)
    {
    g.drawString("scrollbar position",30,150);
    msg+=s1.getValue();
    g.drawString(msg,30,160);
    msg="";
    }
    public static void main(String arg[])
    {
    Myscroll ms=new Myscroll();
    ms.setTitle("MY SCROLL BAR");
    ms.setSize(800,800);
    ms.setVisible(true);
}
}