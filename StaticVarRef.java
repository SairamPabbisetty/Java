// If you want to update the value of the static variable in one object then it will
// reflect in to all other objects in the class.

class StaticVarRef
{
	static int a=10;
	
	public static void main(String[] args)
	{
		StaticVarRef s1 = new StaticVarRef();
		StaticVarRef s2 = new StaticVarRef();

		System.out.println(s1.a);
		System.out.println(s2.a);

		a=20;

		System.out.println(s1.a);
		System.out.println(s2.a);
	}

}