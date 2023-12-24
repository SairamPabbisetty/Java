/* 'this' keyword acts like a reference variable which holds
 the current calling object */

class This01
{
	int a = 10;

	void show()
	{
		int a = 5;
		System.out.println(a); // local variable
		System.out.println(this.a); // class level instance variable
	}

	public static void main(String[] args) 
	{
		This01 t = new This01();
		t.show();
	}
}
