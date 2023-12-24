class Employee
{
	
	String eid;
	String ename;
	char egend;
	final static String INST = "LBRCE";
	int eexp;
	String ework;
	String ecat;

	void dispInfo(int num)
	{
		System.out.println("\nEmployee "+num+" : ");
		System.out.println("Employee Id : "+eid);
		System.out.println("Employee Name : "+ename);
		System.out.println("Employee Gender : "+egend);
		System.out.println("Employee Institution : "+INST);
		System.out.println("Employee Experience : "+eexp);
		System.out.println("Employee Working Mode : "+ework);
		System.out.println("Employee Category : "+ecat+"\n");
	}

	void empInfo(String id, String name, char gend, int exp)
	{
		eid = id;
		ename = name;
		egend = gend;
		eexp = exp;
	}

	void eworkInfo(String work)
	{
		ework = work;

		if (ework=="Teaching")
		{
			if (eexp >= 5)
			{
				ecat = "Professor";
			}
			else if (eexp >= 3 && eexp < 5)
			{
				ecat = "Assoc.Professor";
			}
			else
				ecat = "Asst.Professor";
		}
	}

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();

		// e1.dispInfo(1);
		e1.empInfo("E1","EmployeeA",'M',6);
		e1.eworkInfo("Teaching");
		e1.dispInfo(1);

		// e2.dispInfo(2);
		e2.empInfo("E2","EmployeeB",'M',3);
		e2.eworkInfo("Non-Teaching");
		e2.dispInfo(2);

		// e3.dispInfo(3);
		e3.empInfo("E3","EmployeeC",'M',2);
		e3.eworkInfo("Teaching");
		e3.dispInfo(3);
	}

}