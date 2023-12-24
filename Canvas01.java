import java.awt.*;
import java.awt.event.*;

class MyCanvas extends Canvas
{
	MyCanvas()
	{
		setBackground(Color.RED);
		setSize(200, 200);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.BLUE);
		g.fillOval(30,30,50,50);
	}
}

class Canvas01
{	
	Canvas01()
	{
		Frame f = new Frame();
		f.add(new MyCanvas());
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
		});
		
		f.setSize(500, 500);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Canvas01 c = new Canvas01();
	}
}