  import java.awt.*;
  import java.awt.event.*;
  class Shapesbutton extends Frame implements ActionListener
  {
  Button b1,b2,b3;
  String str;
  Shapesbutton()
  {
  this.setLayout(null);
  b1=new Button("line");
  b2=new Button("square");
  b3=new Button("oval");
  b1.setBounds(50,50,150,100);
  b2.setBounds(50,200,150,100);
  b3.setBounds(50,350,150,100);
  this.add(b1);
  this.add(b2);
  this.add(b3);
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
  str=ae.getActionCommand();
  repaint();
  }
  public void paint(Graphics g)
  {
  if (str.equals("line"))
  {
  g.drawLine(300,50,500,50);
 }

  else if(str.equals("square"))
  {
  	g.drawRect(300,50,150,150);
  }

  else if(str.equals("oval"))
 {
  g.drawOval(300,50,150,200);
  }}
  public static void main(String args[])
  {
  Shapesbutton mb=new Shapesbutton();
  mb.setSize(1000,1000);
  mb.setTitle("Shapes");
  mb.setVisible(true);
  }

  }