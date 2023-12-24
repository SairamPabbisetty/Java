import java.util.*;

class Student
{
	int sid;
	String sname;
	float smarks;

	void display()
	{
		System.out.println("Student id : "+sid);
		System.out.println("Student name : "+sname);
		System.out.println("Student marks : "+smarks);
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student();
		
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter student 1 id : ");
		int id1 = sc.nextInt();
		s1.sid = id1;

		System.out.println("Enter student 1 name : ");
		String name1 = sc.next();
		s1.sname = name1;

		System.out.println("Enter student 1 marks : ");
		float marks1 = sc.nextFloat();
		s1.smarks = marks1;

		s1.display();

		System.out.println("Enter student book : ");
		String book1 = sc.next();
		s1.reading(book1);

		System.out.println("\nEnter student 2 id : ");
		int id2 = sc.nextInt();
		s2.sid = id2;

		System.out.println("Enter student 2 name : ");
		String name2 = sc.next();
		s2.sname = name2;

		System.out.println("Enter student 2 marks : ");
		float marks2 = sc.nextFloat();
		s2.smarks = marks2;

		s2.display();

		System.out.println("Enter student book : ");
		String book2 = sc.next();
		s2.reading(book2);

	}
	
	void reading(String book)
	{
		System.out.println(sname+" reads "+book);
	}

}