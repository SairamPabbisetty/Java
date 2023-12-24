class Parent
{
	int land = 5;

	void dispAmt()
	{
		System.out.println("5 crores");
	}

	public static void main(String[] args)
	{
		Parent p = new Parent();
		
		System.out.println(p.land);
		p.dispAmt();
		// System.out.println(p.pmoney);
		// p.degree(); -- error
	}
}

class Child extends Parent
{
	int pmoney = 500;

	void degree()
	{
		System.out.println("B.Tech CSE");
	}

	public static void main(String[] args)
	{
		Child c = new Child();
		
		System.out.println(c.pmoney);
		c.degree();
		System.out.println(c.land);
		c.dispAmt();

	}
}
