import java.awt.*;
import java.awt.event.*;

class Calci01 implements ActionListener
{
	Frame f;
	Label l1, l2, l3;
	TextField tf1, tf2, tf3;
	Button b1, b2, b3, b4;
	
	Calci01()
	{
		f = new Frame();
		
		l1 = new Label("Enter first number : ");
		l2 = new Label("Enter second number : ");
		l3 = new Label("Result : ");
		
		tf1 = new TextField();
		tf2 = new TextField();
		tf3 = new TextField();
		
		b1 = new Button("+");
		b2 = new Button("-");
		b3 = new Button("*");
		b4 = new Button("/");
		
		l1.setBounds(10, 50, 150, 20);
		l2.setBounds(10, 80, 150, 20);
		l3.setBounds(10, 110, 150, 20);
		
		tf1.setBounds(170, 50, 100, 20);
		tf2.setBounds(170, 80, 100, 20);
		tf3.setBounds(170, 110, 100, 20);
		tf3.setEditable(false);
		
		b1.setBounds(170, 140, 30, 30);
		b2.setBounds(210, 140, 30, 30);
		b3.setBounds(250, 140, 30, 30);
		b4.setBounds(290, 140, 30, 30);
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e)
			{
				f.dispose();
			}
		});
		
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int n1 = Integer.parseInt(tf1.getText());
		int n2 = Integer.parseInt(tf2.getText());
		
		if(e.getSource()==b1)
		{
			int res = n1+n2;
			tf3.setText(res+"");
		}
		if(e.getSource()==b2)
		{
			int res = n1-n2;
			tf3.setText(res+"");
		}
		if(e.getSource()==b3)
		{
			int res = n1*n2;
			tf3.setText(res+"");
		}
		if(e.getSource()==b4)
		{
			int res = n1/n2;
			tf3.setText(res+"");
		}
	}
	
	public static void main(String[] args)
	{
		Calci01 c = new Calci01();
	}
		
}