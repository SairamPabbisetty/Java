class EmpInfoA 
{
	String ename;
	int eage;
	float eexp;
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
		EmpInfoA e1 = new EmpInfoA();
		EmpInfoA e2 = new EmpInfoA();
		EmpInfoA e3 = new EmpInfoA();

		System.out.println("\nEmployee 1 details : ");
		e1.dispInfo();
		System.out.println("\nEmployee 2 details : ");
		e2.dispInfo();
		System.out.println("\nEmployee 3 details : ");
		e3.dispInfo();

	}
}

