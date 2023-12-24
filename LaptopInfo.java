import java.util.*;

class LaptopInfo
{
	String brandName;
	int price;
	float weight;
	boolean screenType;
	char procType;
	String operSys;
	double procSpeed;

	void assignValues()
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter Laptop brand name : ");
		brandName = s.next();

		System.out.println("Enter Laptop price : ");
		price = s.nextInt();

		System.out.println("Enter Laptop weight (in kg) : ");
		weight = s.nextFloat();

		System.out.println("Enter screen type (if Touch screen - true else false) : ");
		screenType = s.nextBoolean();

		System.out.println("Enter processor type (intel or ryzen) : ");
		procType = s.next().charAt(0);

		System.out.println("Enter operating system : ");
		operSys = s.next();

		System.out.println("Enter processor speed (in GHz) : ");
		procSpeed = s.nextDouble();
	}

	void dispInfo()
	{
		System.out.println("Laptop Brand name : "+brandName);
		System.out.println("Laptop price : "+price);
		System.out.println("Laptop weight : "+weight+" kg");
		
		if (screenType==true)
		{
			System.out.println("Laptop is touch screen");
		}
		else
		{
			System.out.println("Laptop is not touch screen");
		}
		
		if (procType=='i')
		{
			System.out.println("Laptop processor type : Intel");
		}
		else
		{
			System.out.println("Laptop processor type : Ryzen");
		}

		System.out.println("Laptop Operating system : "+operSys);
		System.out.println("Laptop Processor speed : "+procSpeed+" GHz");
	}

	public static void main(String[] args) 
	{
		LaptopInfo l1 = new LaptopInfo();
		LaptopInfo l2 = new LaptopInfo();

		System.out.println("\nEnter Laptop 1 details : ");
		l1.assignValues();
		System.out.println("\nLaptop 1 details : ");
		l1.dispInfo();
			
		System.out.println("\nEnter Laptop 2 details : ");
		l2.assignValues();
		System.out.println("\nLaptop 2 details : ");
		l2.dispInfo();
	}
}
