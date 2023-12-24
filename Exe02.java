class Exe02
{
	public static void main(String[] args)
	{
		int a = 10, b = 0;
		int ar[] = new int[5];
		System.out.println("start");
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		try {
			ar[5] = 10;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		
		System.out.println("end");
	}
}