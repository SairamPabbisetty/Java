class StdInfo
{

	int rno;
	String name;
	final static String clgname = "LBRCE";
	final static String branch = "CSE";
	static int sem; 

void display(int a)
{
	System.out.println("\nStudent "+a+" details : ");
	System.out.println("Roll.No : "+rno);
	System.out.println("Name : "+name);
	System.out.println("College : "+clgname);
	System.out.println("Branch : "+branch);
	System.out.println("Semester : "+sem);
}

void setDet(String sname, int roll)
{
	name = sname;
	rno = roll;
}

static void setSem(int ssem)
{
	sem = ssem;
}

public static void main(String[] args)
{

	StdInfo s1 = new StdInfo();
	StdInfo s2 = new StdInfo();

	setSem(4);

	s1.display(1);
	s1.setDet("abc", 211);
	s1.display(1);

	s2.display(2);
	s2.setDet("def", 432);
	s2.display(2);
}

}