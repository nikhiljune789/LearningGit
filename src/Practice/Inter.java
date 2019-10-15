package Practice;

interface abc
{
	default void m1()
	{
		System.out.println("hello");
	}
	
}

interface xyz{
	default void m1()
	{System.out.println("bye");
		
	}
}
class Inter implements abc,xyz
{
	public void m3()
	{
		m1();
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		abc.super.m1();
	}
	public static void main(String[] args) {
		
	}


}