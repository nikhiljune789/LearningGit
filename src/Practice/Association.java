package Practice;

class BankNew
{
	private String name;
	
	public BankNew( String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
		
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
}

class EmployeeNew
{
	private String name;
	
	public EmployeeNew(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}
	
	
	
}


public class Association {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankNew ob=new BankNew("Axis");
		
		EmployeeNew ob1=new EmployeeNew("Rooney");
		
		System.out.println(ob1.getName()+" is employee of "+ob.getName());
		
	}

}
