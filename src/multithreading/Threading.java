package multithreading;

public class Threading extends Thread {

	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		
				try {
					for (int i = 0; i < 10; i++) {
						System.out.println(Thread.currentThread().getName()+"   "+i);
						sleep(600);
		
					}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.out.println(Thread.currentThread().getName());
		
		Threading ob=new Threading();
		Threading ob2=new Threading();
		ob.start();
		
		ob2.start();
		
		//System.out.println(Thread.currentThread().getName());
	}

}
