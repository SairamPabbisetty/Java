// Method over loading

class MethodOverload02
{
	void method(int a, int b)
	{
		System.out.println("Integer - parameters");
	}
	void method(String a, String b)
	{
		System.out.println("String - parameters");
	}
	void method(float a, float b)
	{
		System.out.println("Float - parameters");
	}

	public static void main(String[] args)
	{
		MethodOverload02 m = new MethodOverload02();
		m.method(3.14f, 3.14f);
		m.method("ab", "cd");
		m.method(1, 2);
	}
}