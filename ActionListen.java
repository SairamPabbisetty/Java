import java.awt.*;
import java.awt.event.*;

class ActionListen
{
	Frame f;
	Label l;
	TextField tf;
	Button b;
	
	ActionListen()
	{
		f = new Frame();
		l = new Label("This is a label");
		tf = new TextField();
		b = new Button("Click");
		
		l.setBounds(50, 100, 200, 20);
		tf.setBounds(50, 130, 200, 20);
		b.setBounds(50, 160, 60, 40);
		
		f.add(l);
		f.add(tf);
		f.add(b);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String text = tf.getText();
				l.setText(text);
			}
		});
		
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
		ActionListen a = new ActionListen();
	}
}