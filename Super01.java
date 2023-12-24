/* 'super' is used to call the class level instance variables in the immediate super class */

class Parent
{
	int a = 20;
}

class Child extends Parent
{
	int a = 10;

	void method()
	{
		int a = 5;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}

class Super01 
{
	public static void main(String[] args) 
	{
		Child c = new Child();
		c.method();
	}
}
