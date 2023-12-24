// Multilevel Inheritence

class Gparent
{
	void addition(int a, int b)
	{
		System.out.println("Addition : "+(a+b));
	}
}

class Parent extends Gparent
{
	void subtract(int a, int b)
	{
		System.out.println("Difference : "+(a-b));
	}
}

class Child extends Parent
{
	void product(int a, int b)
	{
		System.out.println("Product : "+(a*b));
	}
}

class SampleD
{
	public static void main(String[] args)
	{
		Child c = new Child();

		c.addition(10, 20);
		c.subtract(10, 20);
		c.product(10, 20);
	}
}