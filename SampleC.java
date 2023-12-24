class Names
{
	String fname, mname, lname;

	Names(String fn, String mn, String ln)
	{
		fname = fn;
		mname = mn;
		lname = ln;
	}
}

class Teaching
{
	int eid;

	Teaching(int id)
	{
		eid = id;
	}

	void display(Names n)
	{
		System.out.println(eid+" "+n.fname+" "+n.mname+" "+n.lname);
	}
}

class NonTeaching
{
	int ntid;

	NonTeaching(int id)
	{
		ntid = id;
	}

	void display(Names n)
	{
		System.out.println(ntid+" "+n.fname+" "+n.mname+" "+n.lname);
	}
}

class Student
{
	int rno;

	Student(int no)
	{
		rno = no;
	}

	void display(Names n)
	{
		System.out.println(rno+" "+n.fname+" "+n.mname+" "+n.lname);
	}
}

class SampleC
{
	public static void main(String[] args)
	{
		Teaching t = new Teaching(10);
		Names n1 = new Names("A","B","C");
		t.display(n1);

		NonTeaching nt = new NonTeaching(20);
		Names n2 = new Names("D","E","F");
		nt.display(n2);

		Student s = new Student(30);
		Names n3 = new Names("G","H","I");
		s.display(n3);
	}
}
