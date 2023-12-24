// Implementing Runnable interface using anonymous inner class

class Thread04
{
	public static void main(String[] args)
	{
		Runnable r = new Runnable(){
			public void run()
			{
				Thread t = Thread.currentThread();
				for(int i=1;i<=3;i++)
				{
					System.out.println(t.getName()+" "+i);
				}
			}
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
	}
}