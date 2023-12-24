import java.awt.*;
import java.awt.event.*;

class MouseListen extends MouseAdapter
{
	Frame f;
	Label l;
	
	MouseListen()
	{
		f = new Frame();
		l = new Label("This is a label");
		
		l.setBounds(50, 100, 100, 20);
		
		f.add(l);
		
		f.addMouseMotionListener(this);
		
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
	
	public void mouseDragged(MouseEvent e)
	{
		Graphics g = f.getGraphics();
		g.setColor(Color.BLACK);
		g.fillOval(e.getX(), e.getY(), 20, 20);
	}
	
	public void mouseMoved(MouseEvent e)
	{
		l.setText("X = "+e.getX()+", Y = "+e.getY());
	}
	
	public static void main(String[] args)
	{
		MouseListen m = new MouseListen();
	}
}