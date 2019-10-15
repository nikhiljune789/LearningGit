package designPatterns;

interface Dress
{
	public void assemble();
}

class BasicDress implements Dress
{

	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		System.out.println("Basic Dress Feature");
	}
	
}

class DressDecorator implements Dress
{
	protected Dress dress;
	
	public  DressDecorator(Dress c) {
		// TODO Auto-generated constructor stub
		this.dress=c;
	}
	
	@Override
	public void assemble() {
		// TODO Auto-generated method stub
		this.dress.assemble();
	}
	
}

class CasualDress extends DressDecorator
{
	

	public CasualDress(Dress c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Adding casual Dress features");
	}
}

class SportyDress extends DressDecorator
{

	public SportyDress(Dress c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Adding Sporty Dress features");
	}
}

class FancyDress extends DressDecorator
{

	public FancyDress(Dress c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	
	public void assemble()
	{
		super.assemble();
		System.out.println("Adding Fancy Dress features");
	}
}

public class Decorator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dress sportydress=new SportyDress(new BasicDress());
		sportydress.assemble();
		System.out.println();
		
		Dress fancydress=new FancyDress(new BasicDress());
		fancydress.assemble();
		System.out.println();
		
		Dress casualdress=new CasualDress(new BasicDress());
		casualdress.assemble();
		System.out.println();
		
		Dress sportyfancydress=new SportyDress(new FancyDress(new BasicDress()));
		sportyfancydress.assemble();
		System.out.println();
		
		Dress casualfancydress=new CasualDress(new FancyDress(new BasicDress()));
		casualfancydress.assemble();
		System.out.println();
	}

}
