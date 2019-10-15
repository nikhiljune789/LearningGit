package Collection;

public class GenericsMethod {
	
	public <T> void m1(T[] x)
	{
		for (T b:x)
		System.out.printf("%s", b);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a[]= {1,2,3,4,5};
		
		Character c[]= {'N','I','K'};
		
		GenericsMethod ob=new GenericsMethod();
		ob.m1(a);
		ob.m1(c);
		
	}

}
