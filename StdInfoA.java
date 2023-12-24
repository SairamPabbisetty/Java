class StdInfoA 
{
	public static void main(String[] args) 
	{
		int sid = Integer.parseInt(args[0]);
		String sname = args[1];
		int sage = Integer.parseInt(args[2]);
		char sgen = args[3].charAt(0);
		float smarks = Float.parseFloat(args[4]);
		double sfdue = Double.parseDouble(args[5]);
		boolean sattd = Boolean.parseBoolean(args[6]);
		
		System.out.println("Student Id : "+sid);
		System.out.println("Student Name : "+sname);
		System.out.println("Student Age : "+sage);
		System.out.println("Student Gender : "+sgen);
		System.out.println("Student Marks : "+smarks);	
		System.out.println("Student Fees due : "+sfdue);
		System.out.println("Student Attended : "+sattd);

	}
}