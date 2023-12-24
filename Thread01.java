class Thread01 extends Thread
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread01();
		
		// t1.start();
		
		Thread t = Thread.currentThread();
		
		System.out.println("\nThread t before setName : "+t.getName());
		t.setName("Main - T1");
		System.out.println("\nThread t after setName  : "+t.getName());
		
		System.out.println("\nThread t before setPriority  : "+t.getPriority());
		t.setPriority(7);
		System.out.println("\nThread t after setPriority : "+t.getPriority());
		
		System.out.println("\nThread t1 before setName : "+t1.getName());
		t1.setName("Thread01 - T1");
		System.out.println("\nThread t1 after setName : "+t1.getName());
		
		System.out.println("\nThread t1 before setPriority : "+t1.getPriority());
		t1.setPriority(4);
		System.out.println("\nThread t1 after setPriority : "+t1.getPriority());
		
		t1.start();
		
	}
}