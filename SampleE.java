// Hierarchical inheritence

class Parent
{
	void dispParent()
	{
		System.out.println("Parent class");
	}
}

class ChildA extends Parent
{
	void dispChildA()
	{
		System.out.println("ChildA class");
	}
}

class ChildB extends Parent
{
	void dispChildB()
	{
		System.out.println("ChildB class");
	}
}

class SampleE
{
	public static void main(String[] args)
	{
		ChildA ca = new ChildA();
		ChildB cb = new ChildB();

		ca.dispChildA();
		ca.dispParent();
		
		// ca.dispChildB(); -- error
		// cb.dispChildA(); -- error
		
		cb.dispParent();
		cb.dispChildB();
	}
}