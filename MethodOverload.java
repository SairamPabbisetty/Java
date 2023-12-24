// Method over loading

class MethodOverload
{
	void method()
	{
		System.out.println("No parameters");
	}
	void method(int a)
	{
		System.out.println("One parameters");
	}
	void method(int a, int b)
	{
		System.out.println("Two parameters");
	}

	public static void main(String[] args)
	{
		MethodOverload m = new MethodOverload();
		m.method();
		m.method(1);
		m.method(1, 2);
	}
}