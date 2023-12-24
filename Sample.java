class AgeException extends Exception
{
	AgeException()
	{
		System.out.println("Not eligible");
	}
}
class Sample
{
	void eligibility(int a)
	{
		try
		{
			if(a<18)
			{
				throw new AgeException();
			}
			else
			{
				System.out.println("eligible");
			}
		}
		catch (Exception e)
		{
		}
	}
	public static void main(String[] args)
	{
		Sample s = new Sample();
		int age = 19;
		try
		{
			s.eligibility(age);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}