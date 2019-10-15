package Practice;

class Bank
{
	String name;
	
	public Bank(String name)
	{
		this.name=name;
	}
	
	public String DisplayBank()
	{
		return this.name;
	}
	
	
	
	
}

class Employee
{
	String name;
	
	public Employee(String name)
	{
		this.name=name;
		
	}
	
	public String DisplayEmployee()
	{
		return this.name;
	}
}




public class Composition {

		public static void main(String[] args) {
	
			Bank ob=new Bank("Axis");
			
			Employee ob2=new Employee("Nikhil");
			
			System.out.println(ob2.DisplayEmployee()+" is a employee of "+ob.DisplayBank());
}
}