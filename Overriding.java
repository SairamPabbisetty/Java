class Parent
{
	void acre()
	{
		System.out.println("5-acres-p");
	}
}

class Child extends Parent
{
	void acre()
	{
		System.out.println("5-acres-c");
	}
	
	void edu()
	{
		System.out.println("B.Tech");
	}
}

class Overriding
{
	public static void main(String[] args)
	{
		Parent p = new Parent();
		Child c = new Child();
	
		p.acre();
		// p.edu() -- error
		c.acre();
		c.edu();
	}
}