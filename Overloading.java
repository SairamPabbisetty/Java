class Overloading
{
	void area(int s)
	{
		System.out.println("Square : "+(s*s));
	}
	
	void area(int l, int b)
	{
		System.out.println("Rectangle : "+(l*b));
	}
	
	void area(float r)
	{
		System.out.println("Circle : "+(3.14*r*r));
	}
	
	public static void main(String[] args)
	{
		Overloading o = new Overloading();
		
		o.area(5);
		o.area(4, 3);
		o.area(1.1f);
	}
}