// Implementing Runnable interface

class Thread03 implements Runnable
{
	public void run()
	{
		Thread t = Thread.currentThread();
		for(int i=1; i<=3; i++)
		{
			System.out.println(t.getName()+" "+i);
		}
	}
	
	public static void main(String[] args)
	{
		Thread03 t = new Thread03();
		
		Thread t1 = new Thread(t);
		t1.start();
		t1.setName("T1");
		
		Thread t2 = new Thread(t);
		t2.start();
		t2.setName("T2");
		
		/* Thread t3 = new Thread(t);
		t3.start();
		t3.setName("T3"); */
	}
}