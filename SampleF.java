// import pack01.*; -- error
import pack01.Calci;
import pack01.Area;

class SampleF
{
	public static void main(String[] args)
	{
		int l = 10;
		int b = 5;
		int s = 4;
		
		Calci c = new Calci();
		Area a = new Area();
		
		c.add(l, b);
		c.sub(l, b);
		c.prod(l, b);
		a.square(s);javajava
		a.rectangle(l, b);
	}
}