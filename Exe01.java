class Exe01
{
	public static void main(String[] args)
	{
		System.out.println("start");
		
		try {
			Class.forName("Sample");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("end");
	}
}