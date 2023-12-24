/* 'this' is used to invoke the instance method in the given class */

class This02 
{
	void method1()
	{
		System.out.println("Method1");
	}

	void method2()
	{
		method1(); // method1 calling
		this.method1(); // method1 calling using 'this' 
	}

	public static void main(String[] args) 
	{
		This02 t = new This02();
		t.method2();
	}
}
