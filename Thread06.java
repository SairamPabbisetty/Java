class Thread06 extends Thread
{
	public void run()
	{
		System.out.println("a");
	}
	public static void main(String[] args)
	{
		Thread06 t1 = new Thread06();
		
		t1.start();
		
		Thread t = Thread.currentThread();
		
		System.out.println("\nThread t1 before setPriority : "+t1.getPriority());
		t1.setPriority(4);
		System.out.println("\nThread t1 after setPriority : "+t1.getPriority());
		
		//t1.start();
		
	}
}