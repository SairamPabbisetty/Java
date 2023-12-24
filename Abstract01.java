// Abstraction using abstract classes and methods

abstract class Vehicle
{
	int tyres;
	abstract void details();
}

class Car extends Vehicle
{
	Car(int t)
	{
		tyres = t;
	}
	void details()
	{
		System.out.println("no.of tyres : "+tyres);
		System.out.println("self-start");
	}
}

class Bike extends Vehicle
{
	Bike(int t)
	{
		tyres = t;
	}
	void details()
	{
		System.out.println("no.of tyres : "+tyres);
		System.out.println("manual-start");
	}
}

class Abstract01
{
	public static void main(String[] args)
	{
		Car c = new Car(4);
		c.details();
		
		Bike b = new Bike(2);
		b.details();
	}
}