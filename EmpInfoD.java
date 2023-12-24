class EmpInfoD
{
	String ename;
	int eage;
	float eexp;
	final static String ECOMP = "LBRCE";

	EmpInfoD(String ename, int eage, float eexp)
	{
		this.ename = ename;
		this.eage = eage;
		this.eexp = eexp;
	}

	void dispInfo()
	{
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Age : "+eage);
		System.out.println("Employee Experience : "+eexp);
		System.out.println("Employee Company : "+ECOMP);
	}

	public static void main(String[] args) 
	{
		EmpInfoD e1 = new EmpInfoD("abc", 21, 5.6f);
		EmpInfoD e2 = new EmpInfoD("def", 22, 5.7f);
		EmpInfoD e3 = new EmpInfoD("ghi", 23, 5.8f);

		System.out.println("\nEmployee 1 details : ");
		e1.dispInfo();
		System.out.println("\nEmployee 2 details : ");
		e2.dispInfo();
		System.out.println("\nEmployee 3 details : ");
		e3.dispInfo();

	}
}

