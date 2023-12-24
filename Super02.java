

class Parent
{
	void m1()
	{
		System.out.println("This is Parent class m1");
	}
}

class Child extends Parent
{
	void m1()
	{
		System.out.println("This is Child class m1");
	}

	void method()
	{
		this.m1();
		super.m1();
	}
}

class Super02 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.method();
	}
}
