class GlobalVar
{	
	int a=10;	

	public static void main(String[] args)
	{
		int b=20;
		System.out.println(b);
		GlobalVar g1 = new GlobalVar();
		System.out.println(g1.a);
	}

}