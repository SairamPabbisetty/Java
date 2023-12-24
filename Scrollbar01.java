import java.awt.*;
import java.awt.event.*;

class Scrollbar01
{
	Scrollbar01()
	{
		Frame f = new Frame();
		
		Scrollbar sc1 = new Scrollbar();
		sc1.setBounds(50,50,50,200);
		f.add(sc1);
		
		Scrollbar sc2 = new Scrollbar(Scrollbar.HORIZONTAL);
		sc2.setBounds(150,50,200,50);
		f.add(sc2);
		
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
		Scrollbar01 s = new Scrollbar01();
	}
}