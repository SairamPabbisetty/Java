class Employee
{

	int eid;
	float esal;
	String ename;
	int eexp;
	char egen;

void display()
{
System.out.println("\nEmployee id : "+eid);
System.out.println("Employee salary : "+esal);
System.out.println("Employee name : "+ename);
System.out.println("Employee experience : "+eexp);
System.out.println("Employee gender : "+egen);
}

void working(String mode)
{
	System.out.println("Employee Mode : "+mode);
	if(mode=="Teaching")
	{
		if(eexp >= 5)
		{
			System.out.println("Proffessor");
		}
		else if(eexp>=3 && eexp<5)
		{
			System.out.println("Assoc-Proffessor");
		}
		else
		{
			System.out.println("Asst-Proffessor");
		}
	}
}

public static void main(String[] args)
{
	Employee e1 = new Employee();
	Employee e2 = new Employee();

	e1.eid = 10;
	e1.esal = 15.23f;
	e1.ename = "abc";
	e1.eexp = 5;
	e1.egen = 'm';
	
	e1.display();
	e1.working("Teaching");
	
	e2.eid = 20;
	e2.esal = 9.23f;
	e2.ename = "def";
	e2.eexp = 3;
	e2.egen = 'f';

	e2.display();
	e2.working("Teaching");

}

}