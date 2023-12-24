// if you want to update value of instance variable in one object then it will not reflect 
// in to the other object

class ObjMod
{

	String name;
	
	public static void main(String[] args)
	{
		ObjMod s1 = new ObjMod();
		ObjMod s2 = new ObjMod();

		System.out.println(s1.name+" "+s2.name);
		s1.name="ABC";
		System.out.println(s1.name+" "+s2.name);
		s2.name="DEF";
		System.out.println(s1.name+" "+s2.name);
	}

}