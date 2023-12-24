// class level instance variable and static context local variable

class InstStatic
{
	int a=10;

	void myMethod()
	{
		int a=5;
		System.out.println(a);
		System.out.println(this.a);
	}	

	public static void main(String[] args)
	{
		InstStatic i1 = new InstStatic();
		System.out.println(i1.a);
		i1.myMethod();
	}

}