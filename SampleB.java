import java.util.*;
class Calculator
{
	void sum(int x, int y)
	{
		int res = x+y;
		System.out.println("Addition : "+res);
	}

	void subtract(int x, int y)
	{
		int res = x-y;
		System.out.println("Subtraction : "+res);
	}

	void product(int x, int y)
	{
		int res = x*y;
		System.out.println("Product : "+res);
	}

	void division(int x, int y)
	{
		int res = x/y;
		System.out.println("Division : "+res);
	}

}

class SampleB extends Calculator
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		SampleB c = new SampleB();

		System.out.println("Enter a value : ");
		int a = sc.nextInt();

		System.out.println("Enter b value : ");
		int b = sc.nextInt();

		c.sum(a,b);
		c.subtract(a,b);
		c.product(a,b);
		c.division(a,b);
	}
}
