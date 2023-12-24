class StudentInfo
{
	String sroll;
	String sname;
	final static String COLLEGE = "LBRCE";
	final static String BRANCH = "CSE";
	static String ssem;

	void dispStdInfo()
	{
		System.out.println("Roll.No : "+sroll);
		System.out.println("Name : "+sname);
		System.out.println("College : "+COLLEGE);
		System.out.println("Branch : "+BRANCH);
		System.out.println("Semester : "+ssem);
	}

	void setStdDet(String name, String roll)
	{
		sname = name;
		sroll = roll;
	}

	static void setSem(String sem)
	{
		ssem = sem;
	}

	public static void main(String[] args) 
	{
		StudentInfo s1 = new StudentInfo();
		StudentInfo s2 = new StudentInfo();
		StudentInfo s3 = new StudentInfo();

		System.out.println("\nWelcome to studnet 1 details : ");
		s1.dispStdInfo();
		s1.setStdDet("Krish","A599");
		s1.setSem("III");
		System.out.println(" ");
		s1.dispStdInfo();

		System.out.println("\nWelcome to studnet 2 details : ");
		s2.dispStdInfo();
		s2.setStdDet("Yathin","A587");
		s2.setSem("III");
		System.out.println(" ");
		s2.dispStdInfo();

		System.out.println("\nWelcome to studnet 3 details : ");
		s3.dispStdInfo();
		s3.setStdDet("Ramesh","A576");
		s3.setSem("III");
		System.out.println(" ");
		s3.dispStdInfo();

	}
}
