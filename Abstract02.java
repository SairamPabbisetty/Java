// Abstraction using interfaces

interface Vehicle
{ 
	int tyres = 4;
	void details();
}

class CarA implements Vehicle
{
	// void details(){} - error : every method should be public
	public void details()
	{
		System.out.println("no.of tyres : "+tyres);
		System.out.println("self-start");
	}
}

class CarB implements Vehicle
{
	public void details()
	{
		System.out.println("no.of tyres : "+tyres);
		System.out.println("manual-start");
	}
}

class Abstract02
{
	public static void main(String[] args)
	{
		CarA a = new CarA();
		a.details();
		
		CarB b = new CarB();
		b.details();
	}
}