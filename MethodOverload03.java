// Method over loading

class MethodOverload03
{
	void method(int a, float b)
	{
		System.out.println("Integer, Float - parameters");
	}
	/* void method(int a, int b)
	{
		System.out.println("Integer, Integer - parameters");
	} */
	void method(float a, int b)
	{
		System.out.println("Float, Integer - parameters");
	}

	public static void main(String[] args)
	{
		MethodOverload03 m = new MethodOverload03();
		m.method(3, 3.14f);
		// m.method('a', 'c');
		m.method(1.2f, 2);
	}
}