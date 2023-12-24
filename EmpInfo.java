class EmpInfo 
{
	String ename="Ravi";
	int eage = 21;
	float eexp = 5.6f;
	final static String ECOMP = "LBRCE";

	void dispInfo()
	{
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Age : "+eage);
		System.out.println("Employee Experience : "+eexp);
		System.out.println("Employee Company : "+ECOMP);
	}

	public static void main(String[] args) 
	{
		EmpInfo e1 = new EmpInfo();
		EmpInfo e2 = new EmpInfo();
		EmpInfo e3 = new EmpInfo();

		System.out.println("\nEmployee 1 details : ");
		e1.dispInfo();
		System.out.println("\nEmployee 2 details : ");
		e2.dispInfo();
		System.out.println("\nEmployee 3 details : ");
		e3.dispInfo();

	}
}
