class EmpInfoB 
{
	String ename;
	int eage;
	float eexp;
	final static String ECOMP = "LBRCE";

	void dispInfo()
	{
		System.out.println("\nEmployee Name : "+ename);
		System.out.println("Employee Age : "+eage);
		System.out.println("Employee Experience : "+eexp);
		System.out.println("Employee Company : "+ECOMP);
	}

	public static void main(String[] args) 
	{
		EmpInfoB e1 = new EmpInfoB();
		EmpInfoB e2 = new EmpInfoB();
		EmpInfoB e3 = new EmpInfoB();

		System.out.println("\nEmployee 1 details : ");
		e1.dispInfo();
		e1.ename = "abc";
		e1.eage = 21;
		e1.eexp = 5.6f;
		e1.dispInfo();

		System.out.println("\nEmployee 2 details : ");
		e2.dispInfo();
		e2.ename = "def";
		e2.eage = 22;
		e2.eexp = 5.7f;
		e2.dispInfo();

		System.out.println("\nEmployee 3 details : ");
		e3.dispInfo();
		e3.ename = "ghi";
		e3.eage = 23;
		e3.eexp = 5.8f;
		e3.dispInfo();
		
	}
}

