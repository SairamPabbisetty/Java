// Method Over riding

class Parent
{
	void prop()
	{
		System.out.println("Parent - 5 acres");
	}
	void pmoney()
	{
		System.out.println("Parent - 1 crore");
	}
}

class Child extends Parent
{
	void prop()
	{
		System.out.println("Child - 5 acres");
	}
	void cmoney()
	{
		System.out.println("Child - 1 crore");
	}
}

class MethodOverride
{
	public static void main(String[] args)
	{
		System.out.println("Parent class reference variable - Parent class object");
		Parent p = new Parent();
		p.prop();
		// p.cmoney(); -- error (Parent class object cannot access child class methods without overriding)

		System.out.println("Child class reference variable - Child class object");
		Child c = new Child();
		c.prop();
		c.pmoney();

		System.out.println("Parent class reference variable - Child class object");
		Parent p1 = new Child();
		p1.prop();
		// p1.cmoney(); -- error (cmoney method is not overrided)
		p1.pmoney();
	}
}