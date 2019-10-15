package Collection;

public class Mutable {

	private String name;
	
	Mutable(String name)
	{
		this.setName(name);
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mutable ob=new Mutable("Nikhil");
		
		System.out.println(ob.getName());
		
		ob.setName("Rooney");
		System.out.println(ob.getName());
		
		StringBuffer str2=new StringBuffer("Ronaldo");
		
		String str3="Hello";
		
		System.out.println(str2.append(str3));
		
		
	}


}
