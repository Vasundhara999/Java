import java.awt.*;
class P extends Frame
{
	public  void paint(Graphics g)
	{

	g.drawRect(100,150,600,480);
	g.setColor(Color.blue);
	g.fillOval(200,200,350,350);
	g.setColor(Color.red);
	g.drawOval(290,300,14,14);
	
	g.drawOval(440,300,14,14);
	g.setColor(Color.yellow);
	g.drawLine(365,300,365,400);
	g.setColor(Color.green);
	g.drawArc(305,430,145,95,180,-180);
	}
	public static void main(String arg[])
	{
	P f=new P();
	f.setSize(800,900);
	f.setTitle("Vasundhara");
	f.setVisible(true);
	}
}