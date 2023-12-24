class Constructor
{

	int sid;
	String sname;

	Constructor(int id, String name)
	{
		System.out.println("Hello World");
		sid = id;
		sname = name;
	}

	public static void main(String[] args)
	{
		Constructor s1 = new Constructor(10, "abc");
		System.out.println(s1.sid+" "+s1.sname);

		Constructor s2 = new Constructor(20, "def");
		System.out.println(s2.sid+" "+s2.sname);
	}

}