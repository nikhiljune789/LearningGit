package designPatterns;

interface OS
{
	 void os(); 
}

class Android implements OS{

	@Override
	public void os() {
		// TODO Auto-generated method stub
		System.out.println("Most Powerful OS");
	}
	
}

class IOS implements OS
{

	@Override
	public void os() {
		// TODO Auto-generated method stub
	System.out.println("Most Secure OS");	
	}
	
}

class Windows implements OS
{

	@Override
	public void os() {
		// TODO Auto-generated method stub
	System.out.println("I am about to die");	
	}
	
}

class Factory{
	public OS getInstance(String str)
	{
		if(str.equals("open"))
			return new Android();
		else if(str.equals("close"))
			return new IOS();
		else 
			return new Windows();
		
	}
}

public class FactoryPattern {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factory fs=new Factory();
		
		Android s=new Android();
	s.o
		OS ob=new Factory().getInstance("close");
		
//		OS ob1=new Android();
//		ob1.os();
		ob.os();
	}

}
