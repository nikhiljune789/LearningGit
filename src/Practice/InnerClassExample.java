package Practice;

class Outer{
		
	void message()
	{
		 int a=10;
		class Inner{
		
		void in()
		{
			System.out.println(a);
		}
	}
		Inner ab=new Inner();
		ab.in();
}
	}	
	public class InnerClassExample {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
						Outer ob=new Outer();
						ob.message();
						}

	}