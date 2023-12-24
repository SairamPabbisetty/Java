/* 'this' is used to return the current class object from methods
 It is used to create references for a single memory block */

class This06
{
	int a, b;

	This06 method1()
	{
		System.out.println("Method1 : "+a+" "+b);
		this.a = 10;
		this.b = 20;

		return this;
	}

	public static void main(String[] args) 
	{
		This06 t = new This06();
		System.out.println("Main method 1 : "+t.a+" "+t.b);

		This06 t1 = t.method1();
		System.out.println("Main method 2 : "+t1.a+" "+t1.b);
	}
}
