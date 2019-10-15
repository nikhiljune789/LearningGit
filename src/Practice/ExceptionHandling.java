package Practice;

public class ExceptionHandling {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {
//			int a[]= {1,2,3,4,5};
//			
//			System.out.println(a[10]);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("Invaild Position");
//		}
		
		int age=9;
		
			if(age<10)
			{
				throw new ArithmeticException("your minor");
			}
			else
			{
				System.out.println("Access Granted");
			}
		
	}

}
