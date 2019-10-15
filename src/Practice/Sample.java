package Practice;


class A{
	
	static void m4()
	{
		System.out.println("m4");
	}
	
}
class B extends A
{
	
	
	
	
	void m1(int a)
	{
		System.out.println("In m2");
	}
	
	void m2(int a)
	{
		System.out.println();
	}
}
public class Sample {
	 void m1()
	{
		System.out.println("Static method");
	}
	public  void main(String[] args) {
		// TODO Auto-generated method stub
	
		A.m4();
	}

}
