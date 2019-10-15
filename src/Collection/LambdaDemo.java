package Collection;

interface A
{
	void show(int a);
	//void m1(int a,int b);
}


public class LambdaDemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A a;
//		a=new A() {
//			public void show()
//			{
//				System.out.println("hello");
//			}
//		};
		
		A a;
		a=(int i)->{
			System.out.println("Hey" +i);
		};
		
		a.show(10);
		
	}

}
