import java.awt.*;
import java.awt.event.*;
class Keys extends Frame implements KeyListener
{
	TextArea ta;
	String msg="";
	Keys()
	{
	setLayout(new FlowLayout());
	ta=new TextArea(5,25);
	Font f=new Font("Sansserif",Font.BOLD,25);
	ta.setFont(f);
	ta.setForeground(Color.red);
	add(ta);
	ta.addKeyListener(this);

	}
	public void keyPressed(KeyEvent ke)
	{
	int keycode=ke.getKeyCode();
	msg+="\nKey code:"+keycode;
	String keyname=ke.getKeyText(keycode);
	msg+="\nKey pressed: "+keyname;
	ta.setText(msg);
	msg="";
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	public void keyReleased(KeyEvent ke)
	{
	int keycode=ke.getKeyCode();
	msg+="\nKey code: "+keycode;
	String keyname=ke.getKeyText(keycode);
	msg+="\nKey Released: "+ keyname;
	ta.setText(msg);
	msg="";
	}
	public static void main(String arg[])
	{
	Keys ks=new Keys();
	ks.setTitle("Catch the keys");
	ks.setSize(500,500);
	ks.setVisible(true);

	}
}