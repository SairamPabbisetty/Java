/* 'this' is used to pass as an argument to the current class constructor
 Method chaining mechanism */

class This04
{
	int a, b;

	void method1()
	{
		System.out.println("method1 : "+a+" "+b);
		method2(this);
	}

	void method2(This04 t1)
	{
		System.out.println("method2 : "+a+" "+b);
		System.out.println("method2 : "+t1.a+" "+t1.b);
	}

	void method3()
	{
		a = 10;
		b = 20;
		System.out.println("\nmethod3 : "+a+" "+b);
		//method4(this);
	}

	void method4(This04 t2)
	{
		System.out.println("method4 : "+a+" "+b);
		System.out.println("method4 : "+t2.a+" "+t2.b);
	}

	public static void main(String[] args) 
	{
		This04 t = new This04();
		t.method1();

		This04 th = new This04();
		th.method3();
	}
}
