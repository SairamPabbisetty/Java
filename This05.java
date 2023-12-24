/* 'this' is used to pass an an argument to the current class constuctor */

class This05
{
	This05()
	{
		System.out.println("Default Constructor");
	}

	This05(This05 t1)
	{
		System.out.println("Parameterized Constructor");
	}

	void method1()
	{
		This05 t2 = new This05(this);
	}

	public static void main(String[] args) 
	{
		This05 t = new This05();
		t.method1();
	}
}
