/* 'this' is used to invoke the current class constructor 
 Constructor chaining mechanism */

class This03
{
	int a;

	This03()
	{
		// this(a); -- error 
		// (cannot reference 'a' before supertype constructor has been called)
		this(1);
		System.out.println("Default constructor "+a);
	}

	This03(int a)
	{
		System.out.println("Parameterized constructor "+a);
	}

	public static void main(String[] args) 
	{
		This03 t = new This03();
	}
}
