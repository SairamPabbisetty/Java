class Exe03
{
	public static void main(String[] args)
	{
		String s = null;
		
		try {
			System.out.println(s.length());
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Finally block");
		}
		
	}
}