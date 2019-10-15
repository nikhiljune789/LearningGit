package Practice;

class BaseNew
{
	public static void abc()
	{
		System.out.println("Base class");
	}
}

class ChildNew extends BaseNew
{
	public static void abc()
	{
		System.out.println("Child class");
	}
}


public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildNew ob=new ChildNew();
		ob.abc();
	}

}
