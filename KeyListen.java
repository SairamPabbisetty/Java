import java.awt.*;
import java.awt.event.*;

class KeyListen extends KeyAdapter
{
	Frame f;
	Label l;
	TextField tf;
	
	KeyListen()
	{
		f = new Frame();
		l = new Label();
		tf = new TextField();
		
		l.setBounds(20, 100, 300, 20);
		tf.setBounds(20, 150, 300, 20);
		
		f.add(l);
		f.add(tf);
		
		l.setText("This is a label");
		
		tf.addKeyListener(this);
		
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
	
	public void keyReleased(KeyEvent e)
	{
		String msg = tf.getText();
		int len = msg.length();
		String words[] = msg.split(" ");
		int count = words.length;
		
		l.setText("Total words : "+count+", Total chars : "+len);
	}
	
	public static void main(String[] args)
	{
		KeyListen k = new KeyListen();
	}
}