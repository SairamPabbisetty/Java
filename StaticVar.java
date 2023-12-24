// accessing static variables

class StaticVar
{
	static int a=10;	

	public static void main(String[] args)
	{
		System.out.println(a);
		StaticVar s1 = new StaticVar();
		System.out.println(s1.a);
		System.out.println(StaticVar.a);
	}

}