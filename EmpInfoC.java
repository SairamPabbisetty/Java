class EmpInfoC
{
	String ename;
	int eage;
	float eexp;
	final static String ECOMP = "LBRCE";

	EmpInfoC(String name, int age, float exp)
	{
		ename = name;
		eage = age;
		eexp = exp;
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
		EmpInfoC e1 = new EmpInfoC("abc", 21, 5.6f);
		EmpInfoC e2 = new EmpInfoC("def", 22, 5.7f);
		EmpInfoC e3 = new EmpInfoC("ghi", 23, 5.8f);

		System.out.println("\nEmployee 1 details : ");
		e1.dispInfo();
		System.out.println("\nEmployee 2 details : ");
		e2.dispInfo();
		System.out.println("\nEmployee 3 details : ");
		e3.dispInfo();

	}
}

