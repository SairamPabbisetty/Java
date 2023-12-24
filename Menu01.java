import java.awt.*;
import java.awt.event.*;

class Menu01
{
	Menu01()
	{
		Frame f = new Frame();
		
		MenuBar mb = new MenuBar();
		
		Menu m1 = new Menu("Departments");
		Menu m2 = new Menu("Admissions");
		
		MenuItem i1 = new MenuItem("Cse");
		MenuItem i2 = new MenuItem("IT");
		MenuItem i3 = new MenuItem("Ece");
		
		Menu i4 = new Menu("More...");
		
		MenuItem i41 = new MenuItem("CE");
		MenuItem i42 = new MenuItem("ME");
		
		i4.add(i41); i4.add(i42);
		m1.add(i1); m1.add(i2); m1.add(i3); m1.add(i4);
		mb.add(m1); mb.add(m2);
		
		f.setMenuBar(mb);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
		});
		
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(null);
	}
	
	public static void main(String[] args)
	{
		Menu01 m = new Menu01();
	}
}