// Naming ambuigity between local and global instance variables

class Naming
{
	int a=20;
	
	void myMethod()
	{
		int a=10;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args)
	{
		Naming n1 = new Naming();
		n1.myMethod();
	}

}