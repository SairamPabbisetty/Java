import java.awt.*;
import java.awt.event.*;

class Border01
{
	Border01()
	{
		Frame f = new Frame();
		
		Button b1 = new Button("North");
		Button b2 = new Button("South");
		Button b3 = new Button("East");
		Button b4 = new Button("West");
		
		f.setLayout(new BorderLayout());
		
		f.add(b1, BorderLayout.NORTH);
		f.add(b2, BorderLayout.SOUTH);
		f.add(b3, BorderLayout.EAST);
		f.add(b4, BorderLayout.WEST);
		
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
		Border01 g = new Border01();
	}
}