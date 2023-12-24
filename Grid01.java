import java.awt.*;
import java.awt.event.*;

class Grid01
{
	Grid01()
	{
		Frame f = new Frame();
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		
		f.setLayout(new GridLayout(2,2,50,50));
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
		});
		
		f.setSize(500, 500);
		f.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		Grid01 g = new Grid01();
	}
}